package com.metehanbolat.dagger_hilt

import com.google.gson.Gson
import javax.inject.Inject

class ClassExample @Inject constructor(private val myInterfaceImplementor: MyInterface, private val gson: Gson) {

    fun myFunction(): String {
        return "Working: ${myInterfaceImplementor.myPrintFunction()}"
    }
}