package com.murad.introtodi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.murad.introtodi.IntroDIApp
import com.murad.introtodi.R
import com.murad.introtodi.di.components.DaggerActivityComponent
import com.murad.introtodi.di.modules.ActivityModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel:MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerActivityComponent.builder().applicationComponent((application as IntroDIApp).applicationComponent).activityModule(ActivityModule()).build().inject(this)

        val text = findViewById<TextView>(R.id.text)
        text.text = viewModel!!.getData()
    }
}