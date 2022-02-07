package com.murad.introtodi.di.modules

import com.murad.introtodi.data.local.DatabaseService
import com.murad.introtodi.data.remote.NetworkService
import com.murad.introtodi.di.qualifier.DatabaseInfo
import com.murad.introtodi.di.qualifier.NetworkInfo
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule() {

    @Provides
    @NetworkInfo
    fun provideApiKey():String{
        return "ApiKey"
    }

    @Provides
    @DatabaseInfo
    fun provideDatabaseName():String{
        return "database"
    }

    @Provides
    fun provideDatabaseVersion():Int{
        return 3
    }


}