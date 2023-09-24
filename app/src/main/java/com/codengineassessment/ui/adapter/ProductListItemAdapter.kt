package com.codengineassessment.ui.adapter

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.codengineassessment.R
import com.codengineassessment.data.model.Categories
import com.codengineassessment.data.model.Food
import com.codengineassessment.data.preferences.PreferenceProvider
import com.codengineassessment.databinding.LayoutCategoryItemBinding
import com.codengineassessment.databinding.LayoutProductItemBinding
import com.codengineassessment.ui.viewmodel.MenuViewModel

class ProductListItemAdapter(
    private val foodList: ArrayList<Food>,
    private val viewModel: MenuViewModel,
    private val preferenceProvider: PreferenceProvider

) : RecyclerView.Adapter<ProductListItemAdapter.ProductViewHolder>() {

    lateinit var layoutInflater: LayoutInflater
    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        context = parent.context
        layoutInflater = LayoutInflater.from(parent.context)
        val binding: LayoutProductItemBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.layout_product_item, parent, false)
        return ProductViewHolder(binding.root, binding)
    }

    override fun getItemCount() = foodList.size

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val category = foodList[position]
        holder.binding.viewModel = viewModel
        holder.binding.data = category
    }

    class ProductViewHolder(itemView: View, var binding: LayoutProductItemBinding) :
        RecyclerView.ViewHolder(itemView) {
    }
}
