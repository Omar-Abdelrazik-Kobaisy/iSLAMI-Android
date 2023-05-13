package com.example.islami

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.islami.databinding.HadethNameItemBinding

class HadethNameAdapter(var ahadeth: List<Hadeth>):Adapter<HadethNameAdapter.ItemViewHolder>(){

    var onItemClickListener:OnItemClickListener? = null

    class ItemViewHolder (val binding: HadethNameItemBinding):ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = HadethNameItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
//        val item:String = ahadeth[position]

        with(holder)
        {
            with(binding)
            {
                hadethName.text = ahadeth[position].title
                root.setOnClickListener {
                        onItemClickListener?.OnItemClick(position, ahadeth[position])
                }

            }
        }
    }

    override fun getItemCount(): Int = ahadeth.size

    interface OnItemClickListener
    {
        fun OnItemClick(position: Int, item: Hadeth)
    }

}