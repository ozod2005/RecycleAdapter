package com.example.recycleadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recycleadapter.databinding.ActivitySecondBinding

class Second : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            var data = intent.getSerializableExtra("key") as course
            web.loadUrl(data.url)
            web.settings.javaScriptEnabled = true
            web.canGoBack()
            web.canGoForward()
        }
    }
}