package com.example.fruitsbasket.view

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import androidx.navigation.findNavController
import com.example.fruitsbasket.R
import com.example.fruitsbasket.viewmodel.RecyclerViewModel

class ListFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Instantiate view model
        val viewModel = ViewModelProvider(requireActivity()).get(RecyclerViewModel::class.java)

        val charData = viewModel.getData()

        // Get view, create adapter (populate items) and add controler
        val recyclerView: RecyclerView = view.findViewById(R.id.recycler)
        val adapter = CharAdapter(charData)

        // Use the declared function from the adapter but redefine what happens in it!
        adapter.onItemClick = {

            // Update the LiveData with the character
            viewModel.setChosenChar(it)
            view.findNavController().navigate(R.id.action_listFragment_to_detailFragment)
        }

        recyclerView.adapter = adapter
    }

}