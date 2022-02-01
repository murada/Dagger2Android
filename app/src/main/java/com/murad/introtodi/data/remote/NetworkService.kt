package com.murad.introtodi.data.remote

import android.content.Context

class NetworkService {

    private var apiKey: String? = null

    constructor(apiKey:String){
        this.apiKey = apiKey
    }

    fun getDummyData():String{
        return  "Data";
    }

}