package com.murad.introtodi.data.remote

import android.content.Context
import com.murad.introtodi.di.qualifier.NetworkInfo
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkService {

    private var apiKey: String? = null

    @Inject
    constructor(@NetworkInfo apiKey:String){
        this.apiKey = apiKey
    }

    fun getDummyData():String{
        return  "Data";
    }

}