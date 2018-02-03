package me.fleka.modernandroidapp

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import me.fleka.modernandroidapp.utility.di.ViewModelBuilder
import javax.inject.Singleton

/**
 * Created by mladenrakonjac on 02/10/17.
 */

@Singleton
@Component(
        modules = [AndroidSupportInjectionModule::class,
            AppModule::class,
            AndroidManagersModule::class,
            ViewModelBuilder::class,
            DataModule::class,
            MainActivityModule::class])
interface AppComponent : AndroidInjector<ModernApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<ModernApplication>()
}