package com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.TileLayoutBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.Tile

class TileAdapter(private val location: Array<Tile>, private val tileListener: TileListener)
    : RecyclerView.Adapter<TileAdapter.ViewHolder>() {

    private lateinit var binding: TileLayoutBinding

    interface TileListener {

        fun onClickTile(position: Int)
    }

    class ViewHolder(binding: TileLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        val layout = binding.layout
        val icon = binding.icon
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        binding = TileLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.layout.setBackgroundResource(location[position].background())
        holder.icon.setImageResource(location[position].icon())
        holder.icon.isVisible = location[position].iconIsVisible()

        holder.layout.setOnClickListener {

            tileListener.onClickTile(position)
        }
    }

    override fun getItemCount(): Int {

        return location.size
    }

}