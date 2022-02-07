package com.murad.introtodi.data.local

import android.content.Context
import com.murad.introtodi.di.qualifier.DatabaseInfo
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DatabaseService {

    private var databaseName: String? = null
    private var version = 0

    @Inject
    constructor(@DatabaseInfo databaseName : String, version:Int) {
        // do the initialisation here
        this.databaseName = databaseName
        this.version = version
    }

    fun getDummyData(): String? {
        return "DATABASE_DUMMY_DATA"
    }

}