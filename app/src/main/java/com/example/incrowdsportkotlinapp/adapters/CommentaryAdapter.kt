package com.example.incrowdsportkotlinapp.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.incrowdsportkotlinapp.R
import com.example.incrowdsportkotlinapp.models.CommentaryData
import kotlinx.android.synthetic.main.commentary_item.view.*

class CommentaryAdapter(private val commentaryList: CommentaryData, val context: Context) : RecyclerView.Adapter<CommentaryAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.commentary_item,
                parent, false))



    }

    override fun getItemCount(): Int = commentaryList.data.commentaryEntries.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.itemView.commment_text.text = commentaryList.data.commentaryEntries.get(position).comment
        holder.itemView.type_text.text = commentaryList.data.commentaryEntries.get(position).type
        holder.itemView.time_text.text = commentaryList.data.commentaryEntries.get(position).time
        holder.itemView.setOnClickListener(View.OnClickListener {
            Toast.makeText(context, commentaryList.data.commentaryEntries.get(position).toString(), Toast.LENGTH_LONG).show()

        })
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
}