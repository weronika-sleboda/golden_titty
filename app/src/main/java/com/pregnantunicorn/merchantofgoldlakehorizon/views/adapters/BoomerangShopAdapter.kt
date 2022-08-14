package com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.BoomerangShopLayoutBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.shops.BoomerangShopItem

class BoomerangShopAdapter(
    private val boomerangs: List<BoomerangShopItem>,
    private val boomerangShopListener: BoomerangShopListener

) : RecyclerView.Adapter<BoomerangShopAdapter.ViewHolder>() {

    private lateinit var binding: BoomerangShopLayoutBinding

    interface BoomerangShopListener {

        fun onClickShopItem(position: Int)
    }

    class ViewHolder(binding: BoomerangShopLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        val icon = binding.icon
        val name = binding.name
        val requiredAccuracy = binding.requiredAccuracy
        val speedInfo = binding.speedInfo
        val styleInfo = binding.styleInfo
        val hitInfo = binding.hitInfo
        val powerInfo = binding.powerInfo
        val price = binding.price
        val buttonIcon = binding.buttonIcon
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        binding = BoomerangShopLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.icon.setImageResource(boomerangs[position].icon)
        holder.name.text = boomerangs[position].name
        holder.requiredAccuracy.text = boomerangs[position].requiredAccuracy
        holder.speedInfo.text = boomerangs[position].speed
        holder.styleInfo.text = boomerangs[position].style
        holder.hitInfo.text = boomerangs[position].hitAmount
        holder.powerInfo.text = boomerangs[position].power
        holder.price.text = boomerangs[position].priceToString()

        holder.buttonIcon.setOnClickListener {

            boomerangShopListener.onClickShopItem(position)
        }
    }

    override fun getItemCount() = boomerangs.size

}