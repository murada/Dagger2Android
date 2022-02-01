package com.murad.introtodi.data.local

import android.content.Context

class DatabaseService {

    private var databaseName: String? = null
    private var version = 0

    constructor(databaseName : String , version:Int) {
        // do the initialisation here
        this.databaseName = databaseName
        this.version = version
    }

    fun getDummyData(): String? {
        return "DATABASE_DUMMY_DATA"
    }

}