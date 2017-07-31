package com.banyue.studymanhuakotlin.ui.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by Administrator on 2017/7/31.
 */
class BasePageAdapter(
        fragmentManager: FragmentManager,
        val fragments: List<Fragment>,
        val titles: List<String>
) : FragmentPagerAdapter(fragmentManager) {

    override fun getCount(): Int = fragments.size//不用做null判断，因为fragment不能为null

    override fun getItem(position: Int): Fragment = fragments.get(position)

    override fun getPageTitle(position: Int): CharSequence = titles.get(position)
}