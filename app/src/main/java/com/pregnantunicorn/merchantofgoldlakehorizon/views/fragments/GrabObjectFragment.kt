package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.GrabObjectFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.grab_objects.CurrentGrabObject
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class GrabObjectFragment : Fragment() {

    private lateinit var binding: GrabObjectFragmentBinding
    private val grabObject = CurrentGrabObject.grabObject()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = GrabObjectFragmentBinding.inflate(inflater, container, false)

        setupName()
        setupIcon()
        setupInfo()
        setupTakeButton()

        return binding.root
    }

    private fun setupName() {

        binding.name.text = grabObject.name
    }

    private fun setupIcon() {

        binding.icon.setImageResource(grabObject.icon)
    }

    private fun setupInfo() {

        binding.info.text = grabObject.info
    }

    private fun setupTakeButton() {

        binding.grabButton.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {

                grabObject.grabAlgorithm.invoke()

                withContext(Dispatchers.Main) {

                    activity?.supportFragmentManager?.commit {

                        replace<LocationFragment>(R.id.world_container)
                    }
                }
            }
        }
    }
}