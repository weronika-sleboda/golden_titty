package com.pregnantunicorn.goldentitty.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.databinding.CampFireFragmentBinding
import com.pregnantunicorn.goldentitty.models.camp_fire.Recipe
import com.pregnantunicorn.goldentitty.models.camp_fire.Recipes
import com.pregnantunicorn.goldentitty.models.current_fragment.CurrentFragment
import com.pregnantunicorn.goldentitty.models.current_fragment.FragmentType
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.models.tools.CurrentHandState
import com.pregnantunicorn.goldentitty.models.tools.HandState
import com.pregnantunicorn.goldentitty.views.adapters.CampFireAdapter
import com.pregnantunicorn.goldentitty.views.callbacks.PlayerStatusUpdate
import com.pregnantunicorn.goldentitty.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CampFireFragment : Fragment(), CampFireAdapter.RecipeListener {

    private lateinit var binding: CampFireFragmentBinding
    private lateinit var adapter: CampFireAdapter
    private lateinit var layoutManager: LinearLayoutManager
    private var recipes: Array<Recipe>? = Recipes().recipes

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = CampFireFragmentBinding.inflate(inflater, container, false)

        CoroutineScope(Dispatchers.IO).launch {

            CurrentFragment.changeFragment(FragmentType.CAMP_FIRE_FRAGMENT)
        }

        updateRecipes()
        setupLeaveButton()
        setupFab()

        return binding.root
    }

    private fun setupFab() {

        val fab = requireActivity().findViewById<FloatingActionButton>(R.id.item_holder)
        fab?.setOnClickListener {

            CurrentHandState.changeHandState(HandState.EMPTY)
            fab.setImageResource(CurrentHandState.fabIcon())
        }
    }

    private fun updatePlayerStatus() {

        val status = requireActivity() as PlayerStatusUpdate
        status.updateFish()
        status.updateCoconuts()
    }

    override fun onClickRecipe(position: Int) {

        CoroutineScope(Dispatchers.IO).launch {

            if(CurrentHandState.handState() == HandState.KNIFE) {

                if(recipes?.get(position)?.make() == true) {

                    withContext(Dispatchers.Main) {

                        showMessage()
                        updatePlayerStatus()
                    }
                }

                else {

                    withContext(Dispatchers.Main) {

                        showMessage()
                    }
                }
            }

            else {

                withContext(Dispatchers.Main) {

                    CurrentMessage.changeMessage(
                        "No Knife",
                        IconFactory().info64(),
                        "Equip a knife."
                    )
                    showMessage()
                }
            }
        }
    }

    private fun updateRecipes() {

        adapter =CampFireAdapter(recipes!!, this)
        layoutManager = LinearLayoutManager(context)
        binding.campFireRecycler.adapter = adapter
        binding.campFireRecycler.layoutManager = layoutManager
    }

    private fun showMessage() {

        InfoDialogFragment(CurrentMessage.message())
            .show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
    }

    override fun onDestroy() {

        recipes = null
        super.onDestroy()
    }

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {

            activity?.supportFragmentManager?.commit {

                replace<LocationFragment>(R.id.world_container)
            }
        }
    }
}