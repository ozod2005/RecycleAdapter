package com.example.recycleadapter

import android.content.Context

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleadapter.databinding.ItemBinding

class RecyclerAdapter (var list:ArrayList<course>,var context: Context): RecyclerView.Adapter<RecyclerAdapter.VH>(){
    private var onClickListener: OnClickListener? = null

    inner class  VH(var binding: ItemBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        var binding2 = ItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return VH(binding2)
    }
    override fun getItemCount(): Int = list.size


    override fun onBindViewHolder(holder: VH, position: Int) {
        var item = list[position]
        holder.binding.title.text = item.course_name.toString()
        holder.binding.star.setImageResource(item.image)
        holder.itemView.setOnClickListener {
            if (onClickListener != null) {
                onClickListener!!.onClick(position, item )
            }
        }
    }

    fun setOnClickListener(onClickListener: OnClickListener) {
        this.onClickListener = onClickListener
    }
    interface OnClickListener {
        fun onClick(position: Int, model: course)
    }


}


