package com.murad.introtodi.di.modules

import com.murad.introtodi.data.local.DatabaseService
import com.murad.introtodi.data.remote.NetworkService
import com.murad.introtodi.di.scope.ActivityScope
import com.murad.introtodi.ui.MainViewModel
import dagger.Module
import dagger.Provides

@Module
class ActivityModule {

    @Provides
    fun provideViewModel(databaseService: DatabaseService , networkService: NetworkService):MainViewModel{
        return MainViewModel(databaseService , networkService)
    }

}