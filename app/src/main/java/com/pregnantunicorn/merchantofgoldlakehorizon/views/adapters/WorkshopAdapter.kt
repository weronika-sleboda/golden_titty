package com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.ToolLayoutBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.WorkshopLayoutBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.tools.Tool
import com.pregnantunicorn.merchantofgoldlakehorizon.models.workshop.Blueprint
import com.pregnantunicorn.merchantofgoldlakehorizon.models.workshop.Workshop

class WorkshopAdapter(
    private val blueprints: List<Blueprint>,
    private val workshopListener: WorkshopListener

) : RecyclerView.Adapter<WorkshopAdapter.ViewHolder>() {

    private lateinit var binding: WorkshopLayoutBinding

    interface WorkshopListener {

        fun onClickTool(position: Int)
    }

    class ViewHolder(binding: WorkshopLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        val icon = binding.icon
        val name = binding.name
        val type = binding.type
        val info = binding.info
        val wood = binding.requirement.wood
        val stone = binding.requirement.stone
        val buttonIcon = binding.buttonIcon
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        binding = WorkshopLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.icon.setImageResource(blueprints[position].icon)
        holder.name.text = blueprints[position].name
        holder.type.text = blueprints[position].type
        holder.info.text = blueprints[position].info
        holder.wood.text = blueprints[position].woodToString()
        holder.stone.text = blueprints[position].stoneToString()

        holder.buttonIcon.setOnClickListener {

            workshopListener.onClickTool(position)
        }
    }

    override fun getItemCount() = blueprints.size

}