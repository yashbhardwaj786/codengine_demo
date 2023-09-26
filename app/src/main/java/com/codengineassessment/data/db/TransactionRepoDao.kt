package com.codengineassessment.data.db

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface TransactionRepoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(transactionInfo: TransactionData)

    @Query("SELECT * FROM transaction_info where userId = :user_id")
    fun getAllUsers(user_id : Int): Flow<List<TransactionData>>

}