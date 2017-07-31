package com.banyue.studymanhuakotlin.ui.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.banyue.studymanhuakotlin.R

/**
 * Created by Administrator on 2017/7/31.
 */
class HomeFragment : Fragment() {

    companion object {
        fun newInstant(): HomeFragment {
            val homeFragment = HomeFragment()
            val bundle: Bundle = Bundle()
            homeFragment.arguments = bundle
            return homeFragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater!!.inflate(R.layout.fragment_home, container, false)
}