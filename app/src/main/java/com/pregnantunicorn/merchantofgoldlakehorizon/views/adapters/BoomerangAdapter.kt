package com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.BoomerangLayoutBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs.Boomerang

class BoomerangAdapter(
    private val boomerangs: List<Boomerang>,
    private val boomerangListener: BoomerangListener

) : RecyclerView.Adapter<BoomerangAdapter.ViewHolder>() {

    private lateinit var binding: BoomerangLayoutBinding

    interface BoomerangListener {

        fun onClickBoomerang(position: Int)
    }

    class ViewHolder(binding: BoomerangLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        val icon = binding.icon
        val name = binding.name
        val requiredAccuracy = binding.requiredAccuracy
        val speedInfo = binding.speedInfo
        val styleInfo = binding.styleInfo
        val hitInfo = binding.hitInfo
        val powerInfo = binding.powerInfo
        val buttonIcon = binding.buttonIcon
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        binding = BoomerangLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.icon.setImageResource(boomerangs[position].icon)
        holder.name.text = boomerangs[position].name
        holder.requiredAccuracy.text = boomerangs[position].requiredAccuracyToString
        holder.speedInfo.text = boomerangs[position].speedInfo
        holder.styleInfo.text = boomerangs[position].styleInfo
        holder.hitInfo.text = boomerangs[position].hitInfo
        holder.powerInfo.text = boomerangs[position].powerInfo

        holder.buttonIcon.setOnClickListener {

            boomerangListener.onClickBoomerang(position)
        }
    }

    override fun getItemCount() = boomerangs.size

}