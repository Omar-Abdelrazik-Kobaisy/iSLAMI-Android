package com.example.islami

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.islami.databinding.ActivityHadethContantBinding

class HadethContantActivity : AppCompatActivity() {
    lateinit var binding: ActivityHadethContantBinding
//    lateinit var adapter: HadethContantAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHadethContantBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.hadethName.text=intent.getStringExtra("hadethname")
        binding.contant.text = intent.getStringExtra("hadethcontant")
//        val fileName = "ahadeth .txt"
//        readFileText(fileName)
//        val hadethcontant = intent.getStringExtra("hadethcontant")!!
//        adapter = HadethContantAdapter(ahadeth_arr)
//        binding.hadethContantRecyclerview.adapter = adapter
        binding.backArrow.setOnClickListener {
            finish()
        }
    }
//    var ahadeth_arr = mutableListOf<Hadeth>()
//    private fun readFileText(fileName: String){
//        val file_contant = assets.open(fileName).bufferedReader().use { it.readText() }
//
//        val ahadeth = file_contant.trim().split("#")
//
//        ahadeth.forEach { single_hadeth->
//            val title = single_hadeth.trim().substringBefore("\n")
//            val contant = single_hadeth.trim().substringAfter("\n")
//            val hadeth = Hadeth(title,contant)
//            ahadeth_arr.add(hadeth)
//        }
//    }
}