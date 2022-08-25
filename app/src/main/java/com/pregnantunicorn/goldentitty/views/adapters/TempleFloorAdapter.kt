package com.pregnantunicorn.goldentitty.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pregnantunicorn.goldentitty.databinding.TempleFloorLayoutBinding
import com.pregnantunicorn.goldentitty.models.temple.TempleFloor

class TempleFloorAdapter(
    private val templeFloors: Array<TempleFloor>,
    private val templeFloorListener: TempleFloorListener

) : RecyclerView.Adapter<TempleFloorAdapter.ViewHolder>() {

    private lateinit var binding: TempleFloorLayoutBinding

    interface TempleFloorListener {

        fun onClickTempleFloor(position: Int)
    }

    class ViewHolder(binding: TempleFloorLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        val icon = binding.icon
        val name = binding.name
        val state = binding.state
        val buttonIcon = binding.buttonIcon
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        binding = TempleFloorLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.icon.setImageResource(templeFloors[position].icon())
        holder.name.text = templeFloors[position].name
        holder.state.text = templeFloors[position].state()

        holder.buttonIcon.setImageResource(templeFloors[position].icon())
        holder.buttonIcon.setOnClickListener {

            templeFloorListener.onClickTempleFloor(position)
        }

    }

    override fun getItemCount() = templeFloors.size

}