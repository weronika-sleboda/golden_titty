package com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.FoodLayoutBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.RobeLayoutBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.clothing.Robe
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Food

class RobeAdapter(
    private val robes: Array<Robe>,
    private val robeListener: RobeListener

) : RecyclerView.Adapter<RobeAdapter.ViewHolder>() {

    private lateinit var binding: RobeLayoutBinding

    interface RobeListener {

        fun onClickRobe(position: Int)
    }

    class ViewHolder(binding:RobeLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        val icon = binding.icon
        val name = binding.name
        val doorInfo = binding.doorInfo
        val charismaInfo = binding.charismaInfo
        val buttonIcon = binding.buttonIcon
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        binding = RobeLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        if(robes[position].owns()) {

            holder.icon.setImageResource(robes[position].icon)
            holder.name.text = robes[position].name
            holder.doorInfo.text = robes[position].doorInfo
            holder.charismaInfo.text = robes[position].charismaInfo

            holder.buttonIcon.setOnClickListener {

                robeListener.onClickRobe(position)
            }
        }

        else {

            holder.icon.isVisible = false
            holder.buttonIcon.isVisible = false
        }
    }

    override fun getItemCount() = robes.size

}