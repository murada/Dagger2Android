package com.murad.introtodi.di.components

import android.app.Application
import com.murad.introtodi.IntroDIApp
import com.murad.introtodi.data.local.DatabaseService
import com.murad.introtodi.data.remote.NetworkService
import com.murad.introtodi.di.modules.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: IntroDIApp)

    fun getNetworkService():NetworkService

    fun getDatabaseService():DatabaseService

}