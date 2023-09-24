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
import com.codengineassessment.databinding.LayoutCategoryItemBinding
import com.codengineassessment.ui.viewmodel.MenuViewModel

class CategoryItemAdapter(
    private val viewModel: MenuViewModel,
    private val categoryProductsList: ArrayList<Categories>
) : RecyclerView.Adapter<CategoryItemAdapter.CategoryViewHolder>() {

    lateinit var layoutInflater: LayoutInflater
    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        context = parent.context
        layoutInflater = LayoutInflater.from(parent.context)
        val binding: LayoutCategoryItemBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.layout_category_item, parent, false)
        return CategoryViewHolder(binding.root, binding)
    }

    override fun getItemCount() = categoryProductsList.size

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = categoryProductsList[position]
        holder.binding.viewModel = viewModel
        holder.binding.data = category
        holder.binding.position = position
        holder.binding.isSelected = category.isSelected
    }

    class CategoryViewHolder(itemView: View, var binding: LayoutCategoryItemBinding) :
        RecyclerView.ViewHolder(itemView) {
    }

    fun setNotifyDataChange() {
        notifyDataSetChanged()
    }
}
