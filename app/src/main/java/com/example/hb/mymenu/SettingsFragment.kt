package com.example.hb.mymenu

import android.os.Bundle
import android.support.v7.preference.PreferenceFragmentCompat
import org.jetbrains.anko.support.v4.toast

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        toast("inSettingsFragment")
        addPreferencesFromResource(R.xml.settings)
    }

}