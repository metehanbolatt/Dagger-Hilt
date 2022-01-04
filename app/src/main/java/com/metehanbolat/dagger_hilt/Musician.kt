package com.metehanbolat.dagger_hilt

class Musician(
    instrument: Instrument,
    band: Band
) {
    fun sign(){
        println("Working")
    }
}