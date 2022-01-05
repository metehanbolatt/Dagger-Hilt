package com.metehanbolat.dagger_hilt

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

interface MyInterface {

    fun myPrintFunction(): String

}

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


