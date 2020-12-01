package com.example.viewpager_navigationfragment_tablayout.view_pager_pages

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter


class MyViewPagerAdapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getCount(): Int = 3

    override fun getItem(position: Int): Fragment =
            when (position) {
                0 -> FirstPageFragment()
                1 -> SecondPageFragment()
                else -> ThirdPageFragment()
            }

    override fun getPageTitle(position: Int): CharSequence? =
            when (position) {
                0 -> "First"
                1 -> "Second"
                else -> "Third"
            }

}