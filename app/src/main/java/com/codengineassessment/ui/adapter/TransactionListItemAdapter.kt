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
import com.codengineassessment.data.db.TransactionData
import com.codengineassessment.data.model.Categories
import com.codengineassessment.data.model.Food
import com.codengineassessment.data.preferences.PreferenceProvider
import com.codengineassessment.databinding.LayoutCategoryItemBinding
import com.codengineassessment.databinding.LayoutProductItemBinding
import com.codengineassessment.databinding.LayoutTransactionItemBinding
import com.codengineassessment.ui.viewmodel.MenuViewModel
import com.codengineassessment.ui.viewmodel.TransactionViewModel

class TransactionListItemAdapter(
    private val transactionList: List<TransactionData>,
    private val viewModel: TransactionViewModel,
) : RecyclerView.Adapter<TransactionListItemAdapter.TransactionViewHolder>() {

    private lateinit var layoutInflater: LayoutInflater
    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        context = parent.context
        layoutInflater = LayoutInflater.from(parent.context)
        val binding: LayoutTransactionItemBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.layout_transaction_item, parent, false)
        return TransactionViewHolder(binding.root, binding)
    }

    override fun getItemCount() = transactionList.size

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        val transaction = transactionList[position]
        holder.binding.viewModel = viewModel
        holder.binding.data = transaction
    }

    class TransactionViewHolder(itemView: View, var binding: LayoutTransactionItemBinding) :
        RecyclerView.ViewHolder(itemView) {
    }
}
