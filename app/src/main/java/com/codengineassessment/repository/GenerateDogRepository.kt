package com.codengineassessment.repository

import com.codengineassessment.common.BaseRepository
import com.codengineassessment.network.FormService
import com.codengineassessment.utils.nullSafeErrorLogging
import java.lang.Exception

class GenerateDogRepository (
    private val formService: FormService
    ):  BaseRepository() {

    suspend fun generateDogImages(): Any {

        return try {
            return apiRequest { formService.generateDogImages() }
        } catch (ex: Exception) {
            nullSafeErrorLogging(ex.localizedMessage)
        }
    }
}