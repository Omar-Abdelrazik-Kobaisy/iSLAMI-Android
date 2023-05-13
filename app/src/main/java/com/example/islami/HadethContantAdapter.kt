package com.example.islami

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.islami.databinding.ActivityHadethContantBinding
import com.example.islami.databinding.HadethContantItemBinding

class HadethContantAdapter(val ahadeth:List<Hadeth>):Adapter<HadethContantAdapter.ItemViewHolder>()  {

    class ItemViewHolder( val binding: HadethContantItemBinding):ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
       val  binding = HadethContantItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val item:Hadeth = ahadeth[position]

        with(holder)
        {
            with(binding)
            {
                hadethContantItem.text = item.contant
            }
        }
    }

    override fun getItemCount(): Int =ahadeth.size
}