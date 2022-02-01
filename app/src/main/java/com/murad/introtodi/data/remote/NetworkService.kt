package com.murad.introtodi.data.remote

import android.content.Context

class NetworkService {

    private var context: Context? = null
    private var apiKey: String? = null

    constructor(context: Context){
        this.context = context
        apiKey = "YES"
    }

    fun getDummyData():String{
        return  "Data";
    }

}