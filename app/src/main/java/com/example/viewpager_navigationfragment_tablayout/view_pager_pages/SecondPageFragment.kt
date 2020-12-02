package com.example.viewpager_navigationfragment_tablayout.view_pager_pages

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.viewpager_navigationfragment_tablayout.R

class SecondPageFragment : Fragment() {
    var counter = 0
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second_page, container, false)
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("fsdfsfsf", "onSaveInstanceState")
        outState.putInt(COUNTER, counter)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.apply {
            val textView = findViewById<TextView>(R.id.text_view)
            val button = findViewById<Button>(R.id.button)

            button.setOnClickListener {
                textView.text = (++counter).toString()
            }

            savedInstanceState?.let {
                counter = it.getInt(COUNTER)
                textView.text = counter.toString()
            }
        }




//        view.findViewById<Button>(R.id.button_second).setOnClickListener {
//            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
//        }
    }
    companion object {
        private const val COUNTER = "counter"
    }

}