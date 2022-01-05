package com.metehanbolat.dagger_hilt

import com.google.gson.Gson
import javax.inject.Inject

class ClassExample @Inject constructor(
    @FirstImplementor private val myInterfaceImplementor: MyInterface,
    private val gson: Gson,
    @SecondImplementor private val mySecondInterfaceImplementor: MyInterface
) {

    fun myFunction(): String {
        return "Working: ${myInterfaceImplementor.myPrintFunction()}"
    }

    fun secondFunction() : String {
        return "Working: ${mySecondInterfaceImplementor.myPrintFunction()}"
    }

}