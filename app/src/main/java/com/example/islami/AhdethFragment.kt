package com.example.islami

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.islami.databinding.FragmentAhdethBinding

class AhdethFragment : Fragment() {
    lateinit var binding: FragmentAhdethBinding
    var ArHadeth: Array<String> = arrayOf<String>(
        "الحديث رقم 1",
        "الحديث رقم 2",
        "الحديث رقم 3",
        "الحديث رقم 4",
        "الحديث رقم 5",
        "الحديث رقم 6",
        "الحديث رقم 7",
        "الحديث رقم 8",
        "الحديث رقم 9",
        "الحديث رقم 10",
        "الحديث رقم 11",
        "الحديث رقم 12",
        "الحديث رقم 13",
        "الحديث رقم 14",
        "الحديث رقم 15",
        "الحديث رقم 16",
        "الحديث رقم 17",
        "الحديث رقم 18",
        "الحديث رقم 19",
        "الحديث رقم 20",
        "الحديث رقم 21",
        "الحديث رقم 22",
        "الحديث رقم 23",
        "الحديث رقم 24",
        "الحديث رقم 25",
        "الحديث رقم 26",
        "الحديث رقم 27",
        "الحديث رقم 28",
        "الحديث رقم 29",
        "الحديث رقم 30",
        "الحديث رقم 31",
        "الحديث رقم 32",
        "الحديث رقم 33",
        "الحديث رقم 34",
        "الحديث رقم 35",
        "الحديث رقم 36",
        "الحديث رقم 37",
        "الحديث رقم 38",
        "الحديث رقم 39",
        "الحديث رقم 40",
        "الحديث رقم 41",
        "الحديث رقم 42",
        "الحديث رقم 43",
        "الحديث رقم 44",
        "الحديث رقم 45",
        "الحديث رقم 47",
        "الحديث رقم 48",
        "الحديث رقم 49",
        "الحديث رقم 50",
    )
    lateinit var adapter: HadethNameAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAhdethBinding.inflate(inflater , container , false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        readFileText("ahadeth .txt")
        adapter = HadethNameAdapter(ahadeth_arr)
        binding.recyclerView.adapter=adapter
        adapter.onItemClickListener = object :HadethNameAdapter.OnItemClickListener{
            override fun OnItemClick(position: Int, item: Hadeth) {
                val intent= Intent(requireActivity(),HadethContantActivity::class.java)
                intent.putExtra("hadethname",item.title);
                intent.putExtra("hadethcontant",item.contant)
                startActivity(intent);
            }
        }
    }
    var ahadeth_arr = mutableListOf<Hadeth>()
    private fun readFileText(fileName: String){
        val file_contant = activity?.assets?.open(fileName)?.bufferedReader().use { it?.readText() }

        val ahadeth = file_contant?.trim()?.split("#")

        ahadeth?.forEach { single_hadeth->
            val title = single_hadeth.trim().substringBefore("\n")
            val contant = single_hadeth.trim().substringAfter("\n")
            val hadeth = Hadeth(title,contant)
            ahadeth_arr.add(hadeth)
        }
    }
}