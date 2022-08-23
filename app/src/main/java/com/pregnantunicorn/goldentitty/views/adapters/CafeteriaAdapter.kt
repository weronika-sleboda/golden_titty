package com.pregnantunicorn.goldentitty.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pregnantunicorn.goldentitty.databinding.CafeteriaLayoutBinding
import com.pregnantunicorn.goldentitty.models.shops.Drink

class CafeteriaAdapter(
    private val drinks: Array<Drink>,
    private val drinkListener: DrinkListener

) : RecyclerView.Adapter<CafeteriaAdapter.ViewHolder>() {

    private lateinit var binding: CafeteriaLayoutBinding

    interface DrinkListener {

        fun onClickDrink(position: Int)
    }

    class ViewHolder(binding:CafeteriaLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        val icon = binding.icon
        val name = binding.name
        val info = binding.info
        val buttonIcon = binding.buttonIcon
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        binding = CafeteriaLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.icon.setImageResource(drinks[position].icon)
        holder.name.text = drinks[position].name
        holder.info.text = drinks[position].info
        holder.buttonIcon.setImageResource(drinks[position].icon)

        holder.buttonIcon.setOnClickListener {

            drinkListener.onClickDrink(position)
        }

    }

    override fun getItemCount() = drinks.size

}