package com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.ItemLayoutBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.items.Item

class ItemAdapter(
    private val items: List<Item>,
    private val itemListener: ItemListener

) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    private lateinit var binding: ItemLayoutBinding

    interface ItemListener {

        fun onClickItem(position: Int)
    }

    class ViewHolder(binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        val icon = binding.icon
        val name = binding.name
        val buttonIcon = binding.buttonIcon
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        binding = ItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.icon.setImageResource(items[position].icon)
        holder.name.text = items[position].name

        holder.buttonIcon.setOnClickListener {

            itemListener.onClickItem(position)
        }

    }

    override fun getItemCount() = items.size

}