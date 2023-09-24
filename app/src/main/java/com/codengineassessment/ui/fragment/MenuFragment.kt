package com.codengineassessment.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.codengineassessment.R
import com.codengineassessment.ui.activity.MainActivity

class MenuFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var mainActivity: MainActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivity = context as MainActivity
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }


    override fun onResume() {
        super.onResume()
        mainActivity.setToolBar(getString(R.string.menu))

    }
}