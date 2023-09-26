package com.codengineassessment.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.codengineassessment.CodengineAssessment
import com.codengineassessment.R
import com.codengineassessment.data.db.TransactionData
import com.codengineassessment.data.preferences.PreferenceProvider
import com.codengineassessment.databinding.FragmentTransactionBinding
import com.codengineassessment.ui.activity.MainActivity
import com.codengineassessment.ui.adapter.ProductListItemAdapter
import com.codengineassessment.ui.adapter.TransactionListItemAdapter
import com.codengineassessment.ui.viewmodel.TransactionViewModel
import com.codengineassessment.ui.viewmodelfactory.TransactionViewModelFactory
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.kodein
import org.kodein.di.generic.instance

class TransactionFragment : Fragment(), KodeinAware {
    private lateinit var mainActivity: MainActivity
    override val kodein by kodein()
    private val prefs: PreferenceProvider by instance()
    private var _binding: FragmentTransactionBinding? = null
    private val transactionViewModel: TransactionViewModel by viewModels {
        TransactionViewModelFactory((activity?.application as CodengineAssessment).repository, prefs)
    }
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivity = context as MainActivity
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentTransactionBinding.inflate(inflater, container, false)
        binding.viewModel = transactionViewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        transactionViewModel.allTransaction?.observe(viewLifecycleOwner, Observer {
            if(it.isNotEmpty()){
                it?.let {
                    initRecyclerView(it)
                }

            }
        })
    }

    private fun initRecyclerView(transactions: List<TransactionData>){
        if (binding.transactionList != null) {
            binding.transactionList.apply {
                val gridLayoutManager = GridLayoutManager(context, 2)
                layoutManager = gridLayoutManager
                adapter = TransactionListItemAdapter(transactions, transactionViewModel)
            }
        }
    }

    override fun onResume() {
        super.onResume()
        mainActivity.setToolBar(getString(R.string.transaction))

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}