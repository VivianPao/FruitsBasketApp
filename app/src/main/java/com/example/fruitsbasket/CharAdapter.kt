package com.example.fruitsbasket

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class CharAdapter(val charList: Array<Character>): RecyclerView.Adapter<CharAdapter.CharViewHolder>() {

    // "Unit" is a return value that signifies the function finishing. Like 'void' but has a value.
    var onItemClick: ((Character) -> Unit)? = null  // null = Empty function declaration
    // Equal to: val variableName: (inputParam1, inputParam2) -> returnType = {what to do}
    // The ()? is because the variable value can possibly be null.

    // Holds all the important views we want to give data to
    // Specifying 'inner' allows the class to access variables from the outer class
    inner class CharViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val nameTextView: TextView = itemView.findViewById(R.id.name)
        private val descTextView: TextView = itemView.findViewById(R.id.desc)
        private val imgView: ImageView = itemView.findViewById(R.id.img)
        val detailButton: ImageButton = itemView.findViewById(R.id.showDetailButton)

        fun bind(char: Character){
            nameTextView.text = char.name
            descTextView.text = char.desc

            // To use Glide with URLs, remember to add INTERNET permissions in Manifest!
            Glide.with(imgView.context).load(char.imageLink).into(imgView)

            detailButton.setOnClickListener {
                // Feed current character as parameter into the function stored in onItemClick
                // .invoke is like a regular function call
                onItemClick?.invoke(charList[adapterPosition])  // Indirectly call function and feed the
            }
        }
    }

    // Convert XML to View, then use the View to instantiate a view holder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.char_item, parent, false)
        return CharViewHolder(view)
    }

    override fun onBindViewHolder(holder: CharViewHolder, position: Int) {
        holder.bind(charList[position])
    }

    override fun getItemCount(): Int {
        return charList.size
    }

}