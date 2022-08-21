package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.UniversityFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.current_fragment.CurrentFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.models.current_fragment.FragmentType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.university.University
import com.pregnantunicorn.merchantofgoldlakehorizon.models.university.UniversitySkill
import com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters.UniversityAdapter
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.PlayerStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class UniversityFragment : Fragment(), UniversityAdapter.UniversityListener {

    private lateinit var binding: UniversityFragmentBinding
    private lateinit var adapter: UniversityAdapter
    private lateinit var layoutManager: LinearLayoutManager
    private var universitySkills: Array<UniversitySkill>? = University().skills

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = UniversityFragmentBinding.inflate(inflater, container, false)

        CoroutineScope(Dispatchers.IO).launch {

            CurrentFragment.changeFragment(FragmentType.UNIVERSITY_FRAGMENT)
        }

        setupLeaveButton()
        setupUniversitySkills()
        setupFab()

        return binding.root
    }

    private fun setupFab() {

        val fab = requireActivity().findViewById<FloatingActionButton>(R.id.item_holder)
        fab?.setOnClickListener {}
    }

    private fun updateMerchantStatus() {

        val status = requireActivity() as PlayerStatusUpdate
        status.updateHealth()
        status.updateAccuracy()
        status.updateAgility()
        status.updateStealth()
    }

    override fun onClickSkillUpgrade(position: Int) {

        CoroutineScope(Dispatchers.IO).launch {

            if(universitySkills?.get(position)?.buy()!!) {

                withContext(Dispatchers.Main) {

                    updateMerchantStatus()
                }
            }

            else {

                withContext(Dispatchers.Main) {

                    CurrentMessage.changeMessage(
                        "Too Expensive",
                        R.drawable.gold_coin_64,
                        "You don't have enough gold coins."
                    )

                    showMessage()
                }
            }
        }
    }

    override fun onClickInfo(position: Int) {

        showMessage()
    }

    private fun setupUniversitySkills() {

        adapter = UniversityAdapter(universitySkills!!, this)
        layoutManager = LinearLayoutManager(context)
        binding.universityRecycler.adapter = adapter
        binding.universityRecycler.layoutManager = layoutManager
    }

    private fun showMessage() {

        InfoDialogFragment(CurrentMessage.message())
            .show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
    }

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {

            activity?.supportFragmentManager?.commit {

                replace<LocationFragment>(R.id.world_container)
            }
        }
    }

    override fun onDestroy() {

        universitySkills = null
        super.onDestroy()
    }
}