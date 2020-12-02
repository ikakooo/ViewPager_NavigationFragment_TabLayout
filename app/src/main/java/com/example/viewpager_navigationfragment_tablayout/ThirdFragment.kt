package com.example.viewpager_navigationfragment_tablayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewpager.widget.ViewPager
import com.example.viewpager_navigationfragment_tablayout.view_pager_pages.MyViewPagerAdapter
import com.google.android.material.tabs.TabLayout

class ThirdFragment : Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.apply {
            val viewPager = findViewById<ViewPager>(R.id.view_pager)
            val tabLayout = findViewById<TabLayout>(R.id.tab_layout)

            val adapter = activity?.supportFragmentManager?.let { MyViewPagerAdapter(it) }
            viewPager.adapter = adapter

            tabLayout.setupWithViewPager(viewPager)
        }



//        view.findViewById<Button>(R.id.button_second).setOnClickListener {
//            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
//        }
    }
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//    }
//
//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//
//    }
}