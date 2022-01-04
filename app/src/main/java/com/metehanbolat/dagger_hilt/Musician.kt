package com.metehanbolat.dagger_hilt

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

// Scope
@ActivityScoped
// Constructor injection
class Musician @Inject constructor(instrument: Instrument, band: Band) {

    fun sign(){
        println("Working")
    }

}