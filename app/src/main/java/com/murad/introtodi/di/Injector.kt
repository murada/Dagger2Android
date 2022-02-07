package com.murad.introtodi.di

import com.murad.introtodi.IntroDIApp
import com.murad.introtodi.data.local.DatabaseService
import com.murad.introtodi.data.remote.NetworkService
import com.murad.introtodi.ui.MainActivity
import com.murad.introtodi.ui.MainViewModel

object Injector {


    fun inject(mainActivity: MainActivity){
        val app = mainActivity.application as IntroDIApp
        mainActivity.viewModel = MainViewModel(app.databaseService , app.networkService)
    }

}