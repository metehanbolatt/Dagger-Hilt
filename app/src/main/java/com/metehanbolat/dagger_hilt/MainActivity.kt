package com.metehanbolat.dagger_hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val instrument = Instrument()
        val band = Band()

        var james = Musician(instrument, band)
        james.sign()
    }
}