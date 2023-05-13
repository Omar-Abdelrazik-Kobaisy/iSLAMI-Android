package com.example.islami

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.islami.databinding.SuraContantItemBinding


class SuraContantAdapter(var sura_item: List<String>?):Adapter<SuraContantAdapter.ItemViewHolder>() {

    class ItemViewHolder (val binding: SuraContantItemBinding) :ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = SuraContantItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        //dataBinding
        val item = sura_item?.get(position)

        with(holder)
        {
            with(binding)
            {
                suraContantItem.text=item
            }
        }
    }

    override fun getItemCount(): Int = sura_item?.size ?:0


}