package com.example.islami

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.islami.databinding.SuraNameItemBinding

class SuraNameAdapter(private val items: Array<String>) : Adapter<SuraNameAdapter.ItemViewHolder> () {

    var onItemClickListener:OnItemClickListener? =null

    class ItemViewHolder(var binding: SuraNameItemBinding) : ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
//        TODO("Not yet implemented")

        val binding : SuraNameItemBinding = SuraNameItemBinding.inflate(LayoutInflater.from(parent.context) , parent , false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
//        TODO("Not yet implemented")
    //Data-Binding
//        val item = items.get(position)
        val item = items[position]

        with(holder)
            {
            with(binding)
                {
                    suraName.text=item
                    root.setOnClickListener {
                        onItemClickListener?.onItemClick(position,item)
                    }
                }
            }
    }

    override fun getItemCount(): Int {
//        TODO("Not yet implemented")
    return items.size
    }
    interface OnItemClickListener{
        fun onItemClick(position: Int,item:String)
    }

}