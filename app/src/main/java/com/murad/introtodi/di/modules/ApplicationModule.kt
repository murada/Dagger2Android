package com.murad.introtodi.di.modules

import com.murad.introtodi.data.local.DatabaseService
import com.murad.introtodi.data.remote.NetworkService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule() {


    @Singleton
    @Provides
    fun provideNetworkService():NetworkService {
      return NetworkService("APIKey")
    }

    @Singleton
    @Provides
    fun provideDataBaseService():DatabaseService {
        return DatabaseService("database",3)
    }

}