package com.murad.introtodi.ui

import android.content.Context
import com.murad.introtodi.data.local.DatabaseService
import com.murad.introtodi.data.remote.NetworkService
import com.murad.introtodi.di.scope.ActivityScope
import javax.inject.Inject

@ActivityScope
class MainViewModel {

    public var databaseService: DatabaseService? = null
    public var networkService: NetworkService? = null

    @Inject
    constructor(databaseService: DatabaseService?, networkService: NetworkService?) {
        this.databaseService = databaseService
        this.networkService = networkService
    }


    fun getData(): String {
        return databaseService!!.getDummyData() + " : " + networkService!!.getDummyData()
    }


}