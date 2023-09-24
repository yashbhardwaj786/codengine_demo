package com.codengineassessment.data.preferences

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type


class PreferenceProvider(var context: Context) {
    private var PRIVATE_MODE = 0
    private val PREFERENCE_NAME = "delphic_demo"
    private val IMAGE_OBJ = "DogImageObject"
    private val preference: SharedPreferences
        get() =
            context.getSharedPreferences(PREFERENCE_NAME, PRIVATE_MODE)

    fun saveData(key: String, value: String) {
        preference.edit().putString(key, value).apply()
    }

    fun getData(key: String): String? {
        return preference.getString(key, null)
    }
    fun saveLong(key: String, value: Long) {
        preference.edit().putLong(key, value).apply()
    }

    fun getLong(key: String, defaultValue: Long): Long? {
        return preference.getLong(key, defaultValue)
    }


    fun saveImagesJsonObject(imagesObj: ArrayList<String?>) {
        val prefsEditor = preference.edit()
        val gson = Gson()
        val json = gson.toJson(imagesObj)
        prefsEditor.putString(IMAGE_OBJ, json)
        prefsEditor.apply()
    }

    fun getImagesJsonObject(): ArrayList<String?>? {
        val gson = Gson()
        val json = preference.getString(IMAGE_OBJ, "")
        val type: Type =
            object : TypeToken<List<String?>?>() {}.type
        return gson.fromJson(json, type)
    }

    fun clearAllPref(): Boolean {
        val editor = preference.edit()
        editor.clear()
        return editor.commit()
    }
}
