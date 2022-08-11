package com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.UniversityLayoutBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.university.UniversitySkill

class UniversityAdapter(
    private val universitySkills: Array<UniversitySkill>,
    private val universityListener: UniversityListener

) : RecyclerView.Adapter<UniversityAdapter.ViewHolder>() {

    private lateinit var binding: UniversityLayoutBinding

    interface UniversityListener {

        fun onClickUniversitySkill(position: Int)
    }

    class ViewHolder(binding: UniversityLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        val icon = binding.icon
        val name = binding.name
        val price = binding.price
        val info = binding.info
        val buttonIcon = binding.buttonIcon
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        binding = UniversityLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.icon.setImageResource(universitySkills[position].icon)
        holder.name.text = universitySkills[position].name
        holder.price.text = universitySkills[position].priceToString()
        holder.info.text = universitySkills[position].info

        holder.buttonIcon.setOnClickListener {

            universityListener.onClickUniversitySkill(position)
        }

    }

    override fun getItemCount() = universitySkills.size

}