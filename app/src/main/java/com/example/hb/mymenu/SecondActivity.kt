package com.example.hb.mymenu

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.preference.PreferenceManager
import kotlinx.android.synthetic.main.activity_second.*
import org.jetbrains.anko.toast

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        // Add a back arrow in toolbar to return to previous activity
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        // Display a default setting preference value
        val defaultSharedPref = PreferenceManager.getDefaultSharedPreferences(this)
        val prefSound = defaultSharedPref.getBoolean(getString(R.string.pref_sound), true)
        toast("prefSound = $prefSound")


        // Write on private setting file & display it
        val sharedPref = getPreferences(Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = sharedPref.edit()
        editor
            .putInt("pouet", 5)
            .commit() //TODO Macha consider using apply

        val pouetPref = sharedPref.getInt("pouet", 0)
//        toast("pouetPref=$pouetPref")
        pouetPrefText.text = pouetPref.toString()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
