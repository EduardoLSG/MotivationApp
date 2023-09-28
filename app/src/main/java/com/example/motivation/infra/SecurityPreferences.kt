package com.example.motivation.infra

import android.content.Context
import android.content.SharedPreferences

class SecurityPreferences(context: Context) {
    private val preferences: SharedPreferences =
        context.getSharedPreferences("Motivation", Context.MODE_PRIVATE)

    fun storeString(key:String, str: String) {
        preferences.edit().putString(key, str).apply()
    }

    fun getString(key:String) : String {
        return preferences.getString(key, "") ?: ""
    }
}