package com.pregnantunicorn.goldentitty.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pregnantunicorn.goldentitty.databinding.KeyItemLayoutBinding
import com.pregnantunicorn.goldentitty.models.key_items.KeyItem

class KeyItemAdapter(
    private val keyItems: List<KeyItem>,
    private val itemListener: ItemListener

) : RecyclerView.Adapter<KeyItemAdapter.ViewHolder>() {

    private lateinit var binding: KeyItemLayoutBinding

    interface ItemListener {

        fun onClickItem(position: Int)
    }

    class ViewHolder(binding: KeyItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        val icon = binding.icon
        val name = binding.name
        val buttonIcon = binding.buttonIcon
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        binding = KeyItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.icon.setImageResource(keyItems[position].icon)
        holder.name.text = keyItems[position].name

        holder.buttonIcon.setOnClickListener {

            itemListener.onClickItem(position)
        }

    }

    override fun getItemCount() = keyItems.size

}