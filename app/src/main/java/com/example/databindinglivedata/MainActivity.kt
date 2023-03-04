package com.example.databindinglivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.databindinglivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.text.text = "Hello There"

        mainViewModel.quoteLiveData.observe(this, Observer {
            binding.text.text = it
        })

        binding.update.setOnClickListener{
            mainViewModel.updateQuote()
        }
    }
}