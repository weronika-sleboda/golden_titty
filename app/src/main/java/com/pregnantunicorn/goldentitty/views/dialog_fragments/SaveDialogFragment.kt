package com.pregnantunicorn.goldentitty.views.dialog_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.pregnantunicorn.goldentitty.databinding.InfoDialogFragmentBinding
import com.pregnantunicorn.goldentitty.databinding.SaveDialogFragmentBinding
import com.pregnantunicorn.goldentitty.models.message.Message
import kotlinx.coroutines.*

class SaveDialogFragment : DialogFragment() {

    private lateinit var binding: SaveDialogFragmentBinding

    companion object {

        const val SAVE_TAG = "SaveTag"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = SaveDialogFragmentBinding.inflate(inflater, container, false)

        binding.saveProgressBar.max = 100
        isCancelable = false

        CoroutineScope(Dispatchers.IO).launch {

            var counter = 0

            while (counter < 100) {

                counter++

                withContext(Dispatchers.Main) {

                    binding.saveProgressBar.progress = counter
                }

                delay(30)
            }

            if(counter == 100) {

                dismiss()
            }
        }

        return binding.root
    }
}