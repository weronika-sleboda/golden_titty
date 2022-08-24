package com.pregnantunicorn.goldentitty.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.pregnantunicorn.goldentitty.databinding.ToolTileLayoutBinding
import com.pregnantunicorn.goldentitty.models.tools.ToolTile

class ToolTileAdapter(private val range: Array<ToolTile>)
    : RecyclerView.Adapter<ToolTileAdapter.ViewHolder>() {

    private lateinit var binding: ToolTileLayoutBinding

    class ViewHolder(binding: ToolTileLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        val layout = binding.layout
        val targetIcon = binding.targetIcon
        val hitIcon = binding.hitIcon
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        binding = ToolTileLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.layout.setBackgroundResource(range[position].background.invoke())
        holder.targetIcon.setImageResource(range[position].targetIcon)
        holder.targetIcon.isVisible = range[position].targetIsVisible
        holder.hitIcon.setImageResource(range[position].hitIcon)
        holder.hitIcon.isVisible = range[position].hitIconIsVisible
    }

    override fun getItemCount(): Int {

        return range.size
    }

}