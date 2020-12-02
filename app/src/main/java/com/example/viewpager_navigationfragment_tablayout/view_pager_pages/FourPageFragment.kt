package com.example.viewpager_navigationfragment_tablayout.view_pager_pages

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.viewpager_navigationfragment_tablayout.R

class FourPageFragment  : Fragment(R.layout.fragment_four_page) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.apply {
            findViewById<Button>(R.id.button_back_to_first).setOnClickListener{
                findNavController().navigate(R.id.action_ThirdFragment_to_FirstFragment)
            }
        }
    }
}