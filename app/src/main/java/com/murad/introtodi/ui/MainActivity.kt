package com.murad.introtodi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.murad.introtodi.R

class MainActivity : AppCompatActivity() {

    private var viewModel:MainViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = MainViewModel(this)



    }
}