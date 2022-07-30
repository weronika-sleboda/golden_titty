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
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.BookcaseFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.books.CurrentBookcase
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters.BookAdapter
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.MerchantStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment

class BookcaseFragment : Fragment(), BookAdapter.BookListener {

    private lateinit var binding: BookcaseFragmentBinding
    private val books = CurrentBookcase.books()
    private lateinit var adapter: BookAdapter
    private lateinit var layoutManager: LinearLayoutManager

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = BookcaseFragmentBinding.inflate(inflater, container, false)

        setupName()
        updateBooks()
        setupLeaveButton()

        return binding.root
    }

    private fun setupName() {

        binding.name.text = CurrentBookcase.bookName()
    }

    private fun updateBooks() {

        adapter = BookAdapter(books, this)
        layoutManager = LinearLayoutManager(context)
        binding.bookRecycler.adapter = adapter
        binding.bookRecycler.layoutManager = layoutManager
    }

    private fun updateMerchantIntelligence() {

        val statusUpdate = requireActivity() as MerchantStatusUpdate
        statusUpdate.updateIntelligence()
    }

    override fun onClickBook(position: Int) {

        if(!books[position].hasBeenRead()) {

            if(!books[position].read()) {

                showMessage()
            }

            else {

                updateBooks()
                updateMerchantIntelligence()
            }
        }
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
}