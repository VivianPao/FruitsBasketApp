package com.example.fruitsbasket

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import android.widget.Toast
import androidx.navigation.findNavController

class ListFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Generate the recycler items
        val charData = DataSource().getCharInfo()
        val recyclerView: RecyclerView = view.findViewById(R.id.recycler)
        val adapter = CharAdapter(charData)

        // Use the declared function from the adapter but redefine what happens in it!
        adapter.onItemClick = {
            view.findNavController().navigate(R.id.action_listFragment_to_detailFragment)
            Toast.makeText(context,it.name,Toast.LENGTH_SHORT).show()
        }

        recyclerView.adapter = adapter
    }

}