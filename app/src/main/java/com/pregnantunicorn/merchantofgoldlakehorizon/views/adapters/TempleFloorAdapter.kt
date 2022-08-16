package com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.TempleFloorLayoutBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.temple_floors.TempleFloor

class TempleFloorAdapter(
    private val templeFloors: Array<TempleFloor>,
    private val templeFloorListener: TempleFloorListener

) : RecyclerView.Adapter<TempleFloorAdapter.ViewHolder>() {

    private lateinit var binding: TempleFloorLayoutBinding

    interface TempleFloorListener {

        fun onClickFloor(position: Int)
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

        holder.icon.setImageResource(IconFactory().templeDoor64())
        holder.name.text = templeFloors[position].name
        holder.state.text = templeFloors[position].state()

        if(templeFloors[position].isConquered()) {

            holder.buttonIcon.setImageResource(
                R.drawable.conquered_floor64
            )

            holder.buttonIcon.setBackgroundResource(
                R.drawable.dark_oval_background
            )

        }

        else {


            if(templeFloors[position].isLocked()) {

                holder.buttonIcon.setImageResource(
                    R.drawable.padlock64
                )
            }

            else {

                holder.buttonIcon.setImageResource(
                    IconFactory().handle64()
                )
            }

            holder.buttonIcon.setBackgroundResource(
                R.drawable.dark_oval_gradient_button_background
            )
        }

        holder.buttonIcon.setOnClickListener {

            templeFloorListener.onClickFloor(position)
        }

    }

    override fun getItemCount() = templeFloors.size

}