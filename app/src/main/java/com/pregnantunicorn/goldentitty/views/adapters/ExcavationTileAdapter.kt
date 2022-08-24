package com.pregnantunicorn.goldentitty.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pregnantunicorn.goldentitty.databinding.ExcavationTileLayoutBinding
import com.pregnantunicorn.goldentitty.models.excavation.ExcavationTile

class ExcavationTileAdapter(
    private val excavationSite: Array<ExcavationTile>,
    private val tileListener: TileListener)

    : RecyclerView.Adapter<ExcavationTileAdapter.ViewHolder>() {

    private lateinit var binding: ExcavationTileLayoutBinding

    interface TileListener {

        fun onClickTile(position: Int)
    }

    class ViewHolder(binding: ExcavationTileLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        val layout = binding.layout
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        binding = ExcavationTileLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.layout.setBackgroundResource(excavationSite[position].background())

        holder.layout.setOnClickListener {

            tileListener.onClickTile(position)
        }
    }

    override fun getItemCount(): Int {

        return excavationSite.size
    }

}