package com.example.hb.mymenu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.preference.PreferenceManager
import org.jetbrains.anko.toast

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Add a back arrow in toolbar to return to previous activity
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Display a setting preference value
        var defaultSharedPref = PreferenceManager.getDefaultSharedPreferences(this)
        val prefSound = defaultSharedPref.getBoolean(getString(R.string.pref_sound), true)
        toast("prefSound = $prefSound")
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
