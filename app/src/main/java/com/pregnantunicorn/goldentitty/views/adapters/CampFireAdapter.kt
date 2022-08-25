package com.pregnantunicorn.goldentitty.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pregnantunicorn.goldentitty.databinding.CampFireLayoutBinding
import com.pregnantunicorn.goldentitty.models.camp_fire.Recipe

class CampFireAdapter(
    private val recipes: Array<Recipe>,
    private val recipeListener: RecipeListener

) : RecyclerView.Adapter<CampFireAdapter.ViewHolder>() {

    private lateinit var binding: CampFireLayoutBinding

    interface RecipeListener {

        fun onClickRecipe(position: Int)
    }

    class ViewHolder(binding: CampFireLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        val icon = binding.icon
        val name = binding.name
        val info = binding.info
        val ingredientIcon = binding.requirement.ingredientIcon
        val ingredientAmount = binding.requirement.ingredient
        val buttonIcon = binding.buttonIcon
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        binding = CampFireLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.icon.setImageResource(recipes[position].icon)
        holder.name.text = recipes[position].name
        holder.info.text = recipes[position].info
        holder.ingredientIcon.setImageResource(recipes[position].ingredientIcon)
        holder.ingredientAmount.text = recipes[position].ingredientAmountToString()

        holder.buttonIcon.setImageResource(recipes[position].buttonIcon)
        holder.buttonIcon.setOnClickListener {

            recipeListener.onClickRecipe(position)
        }
    }

    override fun getItemCount() = recipes.size

}