package com.example.islami

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.islami.databinding.ActivitySuraContentBinding

class SuraContentActivity : AppCompatActivity() {
    lateinit var binding: ActivitySuraContentBinding
    lateinit var adapter: SuraContantAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySuraContentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.suraName.text = intent.getStringExtra(Constant.SURA_ITEM);
        val fileName = "${intent.getIntExtra(Constant.SURA_POSITION,-1).plus(1)}.txt"
         val sura_contant =readFileText(fileName)
        adapter = SuraContantAdapter(sura_contant)
        binding.suraContantRecyclerview.adapter=adapter
        binding.backArrow.setOnClickListener({
            finish()
        })
    }
    private fun readFileText(fileName: String): List<String> {
        val file_contant = assets.open(fileName).bufferedReader().use { it.readText() }
        return  file_contant.split("\n")
    }
}