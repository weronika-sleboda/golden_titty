package com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.RobeLayoutBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.robes.Robe

class RobeAdapter(
    private val robes: List<Robe>,
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

        holder.icon.setImageResource(robes[position].icon)
        holder.name.text = robes[position].name
        holder.doorInfo.text = robes[position].info

        holder.buttonIcon.setOnClickListener {

            robeListener.onClickRobe(position)
        }
    }

    override fun getItemCount() = robes.size

}