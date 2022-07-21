package com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.BookLayoutBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.books.Book

class BookAdapter(
    private val books: Array<Book>,
    private val listener: BookListener
) : RecyclerView.Adapter<BookAdapter.ViewHolder>() {

    private lateinit var binding: BookLayoutBinding

    interface BookListener {

        fun onClickBook(position: Int)
    }

    class ViewHolder(binding: BookLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        val title = binding.title
        val bookContent = binding.bookContent
        val waxSealButton = binding.waxSealButton
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        binding = BookLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        binding.title.text = books[position].title
        binding.bookContent.text = books[position].content

        binding.waxSealButton.setOnClickListener {

            listener.onClickBook(position)
        }

        if(books[position].hasBeenRead()) {

            binding.bookContent.isVisible = true
        }
    }

    override fun getItemCount(): Int {

        return books.size
    }


}