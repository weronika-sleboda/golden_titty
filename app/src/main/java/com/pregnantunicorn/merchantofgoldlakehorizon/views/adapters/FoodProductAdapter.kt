package com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.ProductLayoutBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.shops.Product

class FoodProductAdapter(
    private val products: Array<Product>,
    private val productListener: ProductListener

) : RecyclerView.Adapter<FoodProductAdapter.ViewHolder>() {

    private lateinit var binding: ProductLayoutBinding

    interface ProductListener {

        fun onClickProduct(position: Int)
    }

    class ViewHolder(binding: ProductLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        val icon = binding.icon
        val name = binding.name
        val price = binding.price
        val buttonIcon = binding.buttonIcon
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        binding = ProductLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.icon.setImageResource(products[position].icon)
        holder.name.text = products[position].name
        holder.price.text = products[position].priceToString()

        holder.buttonIcon.setOnClickListener {

            productListener.onClickProduct(position)
        }

    }

    override fun getItemCount() = products.size

}