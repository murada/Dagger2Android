package com.murad.introtodi.ui

import android.content.Context
import com.murad.introtodi.data.local.DatabaseService
import com.murad.introtodi.data.remote.NetworkService

class MainViewModel {

    private var databaseService: DatabaseService? = null
    private var networkService: NetworkService? = null

    constructor(databaseService: DatabaseService?, networkService: NetworkService?) {
        this.databaseService = databaseService
        this.networkService = networkService
    }


    fun getData(): String {
        return databaseService!!.getDummyData() + " : " + networkService!!.getDummyData()
    }


}