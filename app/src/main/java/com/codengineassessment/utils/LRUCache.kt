package com.codengineassessment.utils

import com.codengineassessment.data.preferences.PreferenceProvider
import kotlin.collections.ArrayList

var list: ArrayList<String?> = ArrayList()

var heapSize = 20

fun initializeList(preferenceProvider: PreferenceProvider) {
    preferenceProvider.getImagesJsonObject()?.let {
        list = it
    }
}

fun updateList(x: String?, preferenceProvider: PreferenceProvider) {
    if (!list.contains(x)) {
        if (list.size == heapSize) {
            list.removeAt(0)
        }
    } else {
        if (list.contains(x)) {
            list.remove(x)
        }
    }
    list.add(x)
    preferenceProvider.saveImagesJsonObject(list)
}

fun displayList(): ArrayList<String?> {
    return list
}

fun clearList(preferenceProvider: PreferenceProvider) {
    list.clear()
    list = ArrayList()
    preferenceProvider.saveImagesJsonObject(list)
}