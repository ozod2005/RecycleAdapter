package com.example.recycleadapter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import com.example.recycleadapter.databinding.ActivityMainBinding
import java.text.FieldPosition

class MainActivity : AppCompatActivity(),RecyclerAdapter.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var list: ArrayList<course>
    private lateinit var myAdapter: RecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initList()
        myAdapter = RecyclerAdapter(list,this)
        myAdapter.setOnClickListener(this)
        binding.rv.adapter = myAdapter
    }

    private fun initList() {
        list = ArrayList()
        list.add(course("Kun.uz", R.drawable.kun,"https://kun.uz/ru"))
        list.add(course("Alpari", R.drawable.alpari,"https://alpari.com/ru/converter/usd-uzs/?sum=undefined"))
        list.add(course("Qalampir", R.drawable.qalampir,"https://qalampir.uz/"))
        list.add(course("Daryo", R.drawable.daryo,"https://daryo.uz/"))
        list.add(course("Uzbekistan " ,R.drawable.foot,"https://futboll.tv/"))
        list.add(course("Sports.uz",R.drawable.sports,"https://sports.uz/"))
        list.add(course("CyberSport.uz",R.drawable.cyber,"https://uca.uz/"))
        list.add(course("Uzreport",R.drawable.uzreport,"https://uzreport.news/news-feed"))
        list.add(course("Premier League",R.drawable.liga,"https://www.premierleague.com/"))
    }

    override fun onClick(position: Int, course: course) {
        var intent = Intent(this,Second::class.java)
        intent.putExtra("key",course)
        startActivity(intent)
    }
}