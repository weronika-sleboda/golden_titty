package com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.PalmTileLayoutBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.tools.PalmTile

class PalmAdapter(private val range: Array<PalmTile>)
    : RecyclerView.Adapter<PalmAdapter.ViewHolder>() {

    private lateinit var binding: PalmTileLayoutBinding

    class ViewHolder(binding: PalmTileLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        val layout = binding.layout
        val targetIcon = binding.targetIcon
        val boomerangIcon = binding.boomerangIcon
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        binding = PalmTileLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.layout.setBackgroundResource(range[position].background.invoke())
        holder.targetIcon.setImageResource(range[position].targetIcon)
        holder.targetIcon.isVisible = range[position].targetIsVisible
        holder.boomerangIcon.setImageResource(range[position].boomerangIcon)
        holder.boomerangIcon.isVisible = range[position].boomerangIsVisible
    }

    override fun getItemCount(): Int {

        return range.size
    }

}