package com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.ProductLayoutBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.shops.BoomerangShopItem

class ItemShopAdapter(
    private val boomerangShopItems: List<BoomerangShopItem>,
    private val productListener: ProductListener

) : RecyclerView.Adapter<ItemShopAdapter.ViewHolder>() {

    private lateinit var binding: ProductLayoutBinding

    interface ProductListener {

        fun onClickProduct(position: Int)
    }

    class ViewHolder(binding: ProductLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        val icon = binding.icon
        val name = binding.name
        val price = binding.price
        val buttonIcon = binding.buttonIcon
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        binding = ProductLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.icon.setImageResource(boomerangShopItems[position].icon)
        holder.name.text = boomerangShopItems[position].name
        holder.price.text = boomerangShopItems[position].priceToString()

        holder.buttonIcon.setOnClickListener {

            productListener.onClickProduct(position)
        }

    }

    override fun getItemCount() = boomerangShopItems.size

}