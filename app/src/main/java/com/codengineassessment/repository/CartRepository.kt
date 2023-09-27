package com.codengineassessment.repository

import com.codengineassessment.data.db.TransactionData
import com.codengineassessment.data.db.TransactionRepoDao
import com.codengineassessment.data.preferences.PreferenceProvider
import com.codengineassessment.utils.Constant.Companion.PREF_USER_ID
import kotlinx.coroutines.flow.Flow

class CartRepository (private val transactionRepoDao: TransactionRepoDao) {

    fun allUsers(preference: PreferenceProvider): Flow<List<TransactionData>>
    {
        val userId = preference.getData(PREF_USER_ID)?.toInt() ?: 0
        return transactionRepoDao.getAllUsers(user_id = userId)
    }

    suspend fun insert(transactionInfo: TransactionData) {
        transactionRepoDao.insert(transactionInfo)
    }

}