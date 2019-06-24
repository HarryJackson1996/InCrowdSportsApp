package com.example.incrowdsportskotlin

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.incrowdsportkotlinapp.fragments.FragmentOne
import com.example.incrowdsportkotlinapp.fragments.FragmentTwo


class PageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    //Set tab positions.
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0-> {
                FragmentOne()
            }
            else-> {
                return FragmentTwo()
            }
        }
    }

    // returns 2 tabs.
    override fun getCount(): Int {
        return 2
    }

    // Sets tab titles.
    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0-> "LIVE"
            else->{
                return "STATS"
            }
        }
    }
}