package com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.ItemLayoutBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Item

class ItemAdapter(private val items: Array<Item>)
    : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    private lateinit var binding: ItemLayoutBinding

    class ViewHolder(binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        val icon = binding.icon
        val name = binding.name
        val amount = binding.amount
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        binding = ItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.icon.setImageResource(items[position].icon)
        holder.name.text = items[position].name
        holder.amount.text = items[position].amountToString()
    }

    override fun getItemCount(): Int {

        return items.size
    }
}