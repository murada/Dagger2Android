package com.murad.introtodi

import android.app.Application
import com.murad.introtodi.data.local.DatabaseService
import com.murad.introtodi.data.remote.NetworkService
import com.murad.introtodi.di.components.DaggerApplicationComponent
import com.murad.introtodi.di.modules.ApplicationModule
import javax.inject.Inject

class IntroDIApp : Application() {

    @Inject
    lateinit var networkService:NetworkService
    @Inject
    lateinit var databaseService:DatabaseService

    val applicationComponent =
        DaggerApplicationComponent.builder().applicationModule(ApplicationModule()).build()

    override fun onCreate() {
        super.onCreate()
        applicationComponent.inject(this)
    }
}