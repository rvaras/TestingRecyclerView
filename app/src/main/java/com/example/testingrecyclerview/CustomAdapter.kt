package com.example.testingrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val mList: List<ItemsViewModel>) :
            RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    // Holds the views for adding it to textview
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
       //val textView: TextView = itemView.findViewById(R.id.textView)
       val textView: TextView

       init {
           textView = itemView.findViewById(R.id.textView)
           //drawable = itemView.getResources().getDrawable(R.drawable.smiley_face,"DARK")
          // drawable = itemView.context.resources.getDrawable(R.drawable.smiley_face)
           //textView.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.smiley_face, 0, 0, 0);
       }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design, parent, false)

        return ViewHolder(view)
    }

    // Binds the list items to a view, ie:
    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        /*
        val itemsViewModel = mList[position]

        // sets the text to the textview from our itemHolder class
        holder.textView.text = itemsViewModel.text
        */
        holder.textView.text = mList[position].text
        //holder.textView.setCompoundDrawablesRelativeWithIntrinsicBounds(mList[position].image,0,0,0)
        holder.textView.setCompoundDrawablesWithIntrinsicBounds(mList[position].image,0,0,0)
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount(): Int {
        return mList.size
    }

}
