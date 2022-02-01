package com.murad.introtodi

import android.app.Application
import com.murad.introtodi.data.local.DatabaseService
import com.murad.introtodi.data.remote.NetworkService

class IntroDIApp : Application() {

    public var networkService:NetworkService?=null
    public var databaseService:DatabaseService?=null

    override fun onCreate() {
        super.onCreate()
        this.databaseService = DatabaseService("database",2)
        this.networkService = NetworkService("APIKEY")
    }
}