package com.metehanbolat.dagger_hilt

import javax.inject.Inject

// Constructor injection
class Musician @Inject constructor(instrument: Instrument, band: Band) {

    fun sign(){
        println("Working")
    }

}