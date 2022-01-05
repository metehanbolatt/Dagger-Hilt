package com.metehanbolat.dagger_hilt

import com.google.gson.Gson
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

interface MyInterface {

    fun myPrintFunction(): String

}
/*
// Yol  1
// InstallIn'de tanımlanan scope'u sınıf içerisindeki bind'da vermemiz gerekiyor.
@InstallIn(SingletonComponent::class)
@Module
abstract class MyModule {

    // Burada.
    @Singleton
    @Binds
    abstract fun bindingFunction(myImplementor: MyInterfaceImplementor) : MyInterface

}

 */

@InstallIn(SingletonComponent::class)
@Module
class MyModule {

    @Singleton
    @Provides
    fun providerFunction() : MyInterface {
        return MyInterfaceImplementor()
    }

    @Singleton
    @Provides
    fun gsonProvider() : Gson {
        return Gson()
    }
}

