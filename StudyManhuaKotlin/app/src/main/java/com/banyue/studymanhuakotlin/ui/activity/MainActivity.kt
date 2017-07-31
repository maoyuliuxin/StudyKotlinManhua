package com.banyue.studymanhuakotlin.ui.activity

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.banyue.studymanhuakotlin.R
import com.banyue.studymanhuakotlin.ui.adapter.BasePageAdapter
import com.banyue.studymanhuakotlin.ui.fragment.HomeFragment
import com.banyue.studymanhuakotlin.utils.toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        initToolbar()
        initView()
    }

    private fun initToolbar() {
        setSupportActionBar(toolbar)
    }

    private fun initView() {
        fab.setOnClickListener {
            "fab被点击了".toast()
        }

        var nameList: ArrayList<String> = arrayListOf("在线漫画", "漫画列表", "动漫资讯")
        val fragments = arrayListOf<Fragment>(HomeFragment.newInstant(), HomeFragment.newInstant(), HomeFragment.newInstant())
        view_pager.adapter = BasePageAdapter(fragments = fragments, fragmentManager = supportFragmentManager, titles = nameList)
        tabLayout.setupWithViewPager(view_pager)
        view_pager.offscreenPageLimit = 2
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val itemId = item?.itemId
        if (itemId == R.id.main_setting) {
            "点击了菜单".toast()
        }
        return true
    }
}
