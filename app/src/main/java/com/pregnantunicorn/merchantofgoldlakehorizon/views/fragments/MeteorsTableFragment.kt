package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.recyclerview.widget.LinearLayoutManager
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.MeteorsTableFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.souls.SoulManager
import com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters.SoulAdapter

class MeteorsTableFragment: Fragment() {

    private lateinit var binding: MeteorsTableFragmentBinding
    private lateinit var adapter: SoulAdapter
    private lateinit var layoutManager: LinearLayoutManager
    private val souls = SoulManager.souls

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = MeteorsTableFragmentBinding.inflate(inflater, container, false)

        setupSouls()
        setupLeaveButton()

        return binding.root
    }

    private fun setupSouls() {

        adapter = SoulAdapter(souls)
        layoutManager = LinearLayoutManager(context)
        binding.soulRecycler.adapter = adapter
        binding.soulRecycler.layoutManager = layoutManager
    }

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {

            activity?.supportFragmentManager?.commit {

                replace<LocationFragment>(R.id.world_container)
            }
        }
    }
}