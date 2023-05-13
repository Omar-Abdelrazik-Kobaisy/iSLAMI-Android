package com.example.islami

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Switch
import androidx.fragment.app.Fragment
import com.example.islami.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bottomNavigation.setOnItemSelectedListener {
//            if(it.itemId == R.id.quran)
//            {
//                showFragment(QuranFragment())
//            }else if (it.itemId == R.id.ahdeth)
//            {
//                showFragment(AhdethFragment())
//            }else if (it.itemId == R.id.sebha)
//            {
//                showFragment(SebhaFragment())
//            }else if (it.itemId == R.id.radio)
//            {
//                showFragment(RadioFragment())
//            }
            when (it.itemId) {
                R.id.quran -> showFragment(QuranFragment())
                R.id.ahdeth -> showFragment(AhdethFragment())
                R.id.sebha -> showFragment(SebhaFragment())
                R.id.radio -> showFragment(RadioFragment())
                else -> {
                    Log.e("---------------->","fragment issue" )
                }
            }
            Log.e("test <--","fragment issue" )
            return@setOnItemSelectedListener true
        }
        binding.bottomNavigation.selectedItemId = R.id.quran
    }

    private fun showFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).commit()
    }
}