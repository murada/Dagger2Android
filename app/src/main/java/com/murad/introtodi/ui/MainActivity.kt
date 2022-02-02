package com.murad.introtodi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.murad.introtodi.DI.Injector
import com.murad.introtodi.IntroDIApp
import com.murad.introtodi.R

class MainActivity : AppCompatActivity() {

    public var viewModel:MainViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Injector.inject(this)

        val text = findViewById<TextView>(R.id.text)
        text.text = viewModel!!.getData()
    }
}