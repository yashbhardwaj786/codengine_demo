package com.codengineassessment.repository

import com.codengineassessment.common.BaseRepository
import com.codengineassessment.data.db.TransactionData
import com.codengineassessment.data.db.TransactionRepoDao
import kotlinx.coroutines.flow.Flow

class CartRepository (private val transactionRepoDao: TransactionRepoDao):  BaseRepository() {

    var allUsers: Flow<List<TransactionData>> = transactionRepoDao.getAllUsers(user_id = 101)

    suspend fun insert(transactionInfo: TransactionData) {
        transactionRepoDao.insert(transactionInfo)
    }

}