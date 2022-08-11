package com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.CarriageLayoutBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.FoodLayoutBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.carriage.Carriage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.carriage.CarriageItem
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Food

class CarriageAdapter(
    private val carriageItems: Array<CarriageItem>,
    private val carriageListener: CarriageListener

) : RecyclerView.Adapter<CarriageAdapter.ViewHolder>() {

    private lateinit var binding: CarriageLayoutBinding

    interface CarriageListener {

        fun onClickCarriageItem(position: Int)
    }

    class ViewHolder(binding: CarriageLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        val icon = binding.icon
        val name = binding.name
        val worth = binding.worth
        val buttonIcon = binding.buttonIcon
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        binding = CarriageLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.icon.setImageResource(carriageItems[position].icon)
        holder.name.text = carriageItems[position].name
        holder.worth.text = carriageItems[position].worthToString

        holder.buttonIcon.setOnClickListener {

            carriageListener.onClickCarriageItem(position)
        }

    }

    override fun getItemCount() = carriageItems.size

}