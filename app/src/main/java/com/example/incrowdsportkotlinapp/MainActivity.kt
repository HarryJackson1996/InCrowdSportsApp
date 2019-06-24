package com.example.incrowdsportkotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.incrowdsportskotlin.PageAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentAdapter = PageAdapter(supportFragmentManager)
        view_pager.adapter = fragmentAdapter
        tab_layout.setupWithViewPager(view_pager)
    }
}