package com.murad.introtodi.di.components

import com.murad.introtodi.di.modules.ActivityModule
import com.murad.introtodi.di.scope.ActivityScope
import com.murad.introtodi.ui.MainActivity
import com.murad.introtodi.ui.MainViewModel
import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)

    fun getViewModel():MainViewModel

}