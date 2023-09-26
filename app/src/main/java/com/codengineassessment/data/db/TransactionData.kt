package com.codengineassessment.data.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "transaction_info", indices = [Index(value = ["userId","firstName","lastName","mobile","email","quantity","price","time"], unique = true)])
data class TransactionData(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "transactionId")
    val id : Int = 0,
    var userId: String,
    var firstName: String,
    var lastName: String,
    var mobile: String,
    var email: String,
    var quantity: Int,
    var price: Double,
    var time: String,
)