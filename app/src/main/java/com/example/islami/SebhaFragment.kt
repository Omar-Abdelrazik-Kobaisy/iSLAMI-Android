package com.example.islami

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.islami.databinding.FragmentSebhaBinding

class SebhaFragment : Fragment(){
    lateinit var binding: FragmentSebhaBinding
    var counter =1
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSebhaBinding.inflate(inflater , container , false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.sebhaBtn.setOnClickListener {
            binding.counter.text = counter.toString();
            counter++;
            if(counter == 34 && binding.sebhaBtn.text.equals("سبحان الله"))
            {
                binding.sebhaBtn.text="الحمد الله"
                counter = 1;
            }else if (counter == 34 && binding.sebhaBtn.text.equals("الحمد الله"))
            {
                binding.sebhaBtn.text="الله اكبر"
                counter = 1;
            }else if (counter == 34 && binding.sebhaBtn.text.equals("الله اكبر"))
            {
                binding.sebhaBtn.text="سبحان الله"
                counter = 1;
            }

        }
    }
}