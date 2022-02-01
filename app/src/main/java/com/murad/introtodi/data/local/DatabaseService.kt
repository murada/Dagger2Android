package com.murad.introtodi.data.local

import android.content.Context

class DatabaseService {

    private var context: Context? = null
    private var databaseName: String? = null
    private var version = 0

    constructor(context: Context?) {
        // do the initialisation here
        this.context = context
        databaseName = "dummy_db"
        version = 1
    }

    fun getDummyData(): String? {
        return "DATABASE_DUMMY_DATA"
    }

}