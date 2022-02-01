package com.murad.introtodi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.murad.introtodi.IntroDIApp
import com.murad.introtodi.R

class MainActivity : AppCompatActivity() {

    private var viewModel:MainViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var app = this.application as IntroDIApp
        viewModel = MainViewModel(app.databaseService , app.networkService)



    }
}