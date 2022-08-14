package com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.FoodLayoutBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.food.Food

class FoodAdapter(
    private val foodManagers: Array<Food>,
    private val foodListener: FoodListener

) : RecyclerView.Adapter<FoodAdapter.ViewHolder>() {

    private lateinit var binding: FoodLayoutBinding

    interface FoodListener {

        fun onClickFood(position: Int)
    }

    class ViewHolder(binding: FoodLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        val icon = binding.icon
        val name = binding.name
        val info = binding.info
        val amount = binding.amount
        val buttonIcon = binding.buttonIcon
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        binding = FoodLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.icon.setImageResource(foodManagers[position].icon)
        holder.name.text = foodManagers[position].name
        holder.info.text = foodManagers[position].info
        holder.amount.text = foodManagers[position].amountToString.invoke()
        holder.buttonIcon.setImageResource(foodManagers[position].icon)

        holder.buttonIcon.setOnClickListener {

            foodListener.onClickFood(position)
        }

    }

    override fun getItemCount() = foodManagers.size

}