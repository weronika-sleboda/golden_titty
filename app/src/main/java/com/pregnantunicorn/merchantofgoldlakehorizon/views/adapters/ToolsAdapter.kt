package com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.ToolLayoutBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.tools.Tool

class ToolsAdapter(
    private val tools: List<Tool>,
    private val boomerangListener: BoomerangListener

) : RecyclerView.Adapter<ToolsAdapter.ViewHolder>() {

    private lateinit var binding: ToolLayoutBinding

    interface BoomerangListener {

        fun onClickBoomerang(position: Int)
    }

    class ViewHolder(binding: ToolLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        val icon = binding.icon
        val name = binding.name
        val type = binding.type
        val info = binding.info
        val buttonIcon = binding.buttonIcon
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        binding = ToolLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.icon.setImageResource(tools[position].icon())
        holder.name.text = tools[position].name()
        holder.type.text = tools[position].type()
        holder.info.text = tools[position].info()

        holder.buttonIcon.setOnClickListener {

            boomerangListener.onClickBoomerang(position)
        }
    }

    override fun getItemCount() = tools.size

}