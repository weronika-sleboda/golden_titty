package com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.UniversityLayoutBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.university.UniversitySkill

class UniversityAdapter(
    private val universitySkills: Array<UniversitySkill>,
    private val universityListener: UniversityListener

) : RecyclerView.Adapter<UniversityAdapter.ViewHolder>() {

    private lateinit var binding: UniversityLayoutBinding

    interface UniversityListener {

        fun onClickSkillUpgrade(position: Int)
        fun onClickInfo(position: Int)
    }

    class ViewHolder(binding: UniversityLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        val icon = binding.icon
        val name = binding.name
        val price = binding.price
        val infoButton = binding.infoButton
        val upgradeButton = binding.upgradeButton
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

        holder.infoButton.setOnClickListener {

            universitySkills[position].infoAlgorithm.invoke()
            universityListener.onClickInfo(position)
        }

        holder.upgradeButton.setOnClickListener {

            universityListener.onClickSkillUpgrade(position)
        }

    }

    override fun getItemCount() = universitySkills.size

}