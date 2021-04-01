package com.example.fruitsbasket.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.fruitsbasket.R
import com.example.fruitsbasket.viewmodel.RecyclerViewModel

class DetailFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // ViewModelProvider needed to instantiate SHARED viewmodel between fragments so we can pass data
        val viewModel = ViewModelProvider(requireActivity()).get(RecyclerViewModel::class.java)

        // Views
        val nameView: TextView = view.findViewById(R.id.detailTitle)
        val descView: TextView = view.findViewById(R.id.detailDesc)
        val imgView: ImageView = view.findViewById(R.id.detailImg)

        // Get current chosen character and let the data show in the views
        val chosenChar = viewModel.chosenChar?.value
        nameView.text = chosenChar?.name
        descView.text = chosenChar?.desc
        Glide.with(view.context).load(chosenChar?.imageLink).into(imgView)

        // We don't need to 'observe' for our function, could probably just access the data as is?
        // But this is good for a live update template for when we load data from background asynchronously.
        // viewLifecycleOwner Allows this observer to be destroyed when the view is destroyed.
        // Using 'this' as the owner means the observer is still alive as long as the app lives.
        // Unexpected behaviour may result.
        // This didn't detect any changers because it already changed before we created the fragment
//        viewModel.chosenChar?.observe(viewLifecycleOwner, Observer { selectedChar ->
//            selectedChar?.let{
//                nameView.text = selectedChar.name
//                descView.text = selectedChar.desc
//                Glide.with(view.context).load(selectedChar.imageLink).into(imgView)
//            }
//        })

    }
}