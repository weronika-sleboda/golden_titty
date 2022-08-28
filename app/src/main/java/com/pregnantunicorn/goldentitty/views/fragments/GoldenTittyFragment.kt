package com.pregnantunicorn.goldentitty.views.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.pregnantunicorn.goldentitty.databinding.GoldenTittyFragmentBinding
import com.pregnantunicorn.goldentitty.models.current_fragment.CurrentFragment
import com.pregnantunicorn.goldentitty.models.current_fragment.FragmentType
import com.pregnantunicorn.goldentitty.models.story_line.CurrentEvent
import com.pregnantunicorn.goldentitty.models.story_line.EventTitle
import com.pregnantunicorn.goldentitty.views.activities.EventActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class GoldenTittyFragment : Fragment() {

    private lateinit var binding: GoldenTittyFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = GoldenTittyFragmentBinding.inflate(inflater, container, false)

        CoroutineScope(Dispatchers.IO).launch {

            CurrentFragment.changeFragment(FragmentType.GOLDEN_TITTY_FRAGMENT)
        }

        setupTakeButton()

        return binding.root
    }

    private fun setupTakeButton() {

        binding.takeButton.setOnClickListener {

            CurrentEvent.changeEvent(EventTitle.ENDING)

            val intent = Intent(context, EventActivity::class.java)
            startActivity(intent)
        }
    }
}