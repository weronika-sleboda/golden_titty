package com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.FoodLayoutBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.SoulLayoutBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Food
import com.pregnantunicorn.merchantofgoldlakehorizon.models.souls.Soul

class SoulAdapter(
    private val souls: Array<Soul>,
) : RecyclerView.Adapter<SoulAdapter.ViewHolder>() {

    private lateinit var binding: SoulLayoutBinding

    class ViewHolder(binding: SoulLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        val icon = binding.icon
        val name = binding.name
        val info = binding.info
        val buttonIcon = binding.buttonIcon
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        binding = SoulLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.icon.setImageResource(souls[position].icon)
        holder.name.text = souls[position].name
        holder.info.text = souls[position].info

        if(souls[position].isRescued()) {

            holder.buttonIcon.isVisible = true
        }
    }

    override fun getItemCount() = souls.size

}