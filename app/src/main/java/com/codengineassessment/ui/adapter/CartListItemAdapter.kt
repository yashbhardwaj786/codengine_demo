package com.codengineassessment.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.codengineassessment.R
import com.codengineassessment.data.model.CartItemProduct
import com.codengineassessment.data.preferences.PreferenceProvider
import com.codengineassessment.databinding.LayoutCartItemBinding
import com.codengineassessment.ui.viewmodel.CartViewModel
import com.codengineassessment.ui.viewmodel.CartContract

class CartListItemAdapter(
    private val viewModel: CartViewModel,
    var cartItemList: ArrayList<CartItemProduct>,
    val cartListener: CartContract,
    private val preferenceProvider: PreferenceProvider

) : RecyclerView.Adapter<CartListItemAdapter.ProductViewHolder>() {

    lateinit var layoutInflater: LayoutInflater
    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        context = parent.context
        layoutInflater = LayoutInflater.from(parent.context)
        val binding: LayoutCartItemBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.layout_cart_item, parent, false)
        return ProductViewHolder(binding.root, binding)
    }

    override fun getItemCount() = cartItemList.size

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val category = cartItemList[position]
        holder.binding.viewModel = viewModel
        holder.binding.data = category

        holder.binding.increase.setOnClickListener {
            cartListener.increaseQuantity(category, holder.adapterPosition)
        }
        holder.binding.decrease.setOnClickListener {
            cartListener.decreaseQuantity(category, holder.adapterPosition)
        }
    }

    class ProductViewHolder(itemView: View, var binding: LayoutCartItemBinding) :
        RecyclerView.ViewHolder(itemView) {
    }
    fun setNotifyDataChange() {
        notifyDataSetChanged()
    }
}
