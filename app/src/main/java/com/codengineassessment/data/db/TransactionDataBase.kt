package com.codengineassessment.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

//@Database(entities = [TransactionData::class], version = 1, exportSchema = false)
//abstract class TransactionInfoDataBase() : RoomDatabase() {
//
//    abstract fun transactionEntryDao(): TransactionRepoDao
//
//    companion object {
//
//        @Volatile
//        private var INSTANCE: TransactionInfoDataBase? = null
//
//        fun getDatabase(ctx: Context): TransactionInfoDataBase {
//            return when (val temp = INSTANCE) {
//                null -> synchronized(this) {
//                    Room.databaseBuilder(
//                        ctx.applicationContext, TransactionInfoDataBase::class.java,
//                        "transaction_info"
//                    )
//                        .fallbackToDestructiveMigration()
//                        .build()
//                }
//                else -> temp
//            }
//        }
//    }
//}

@Database(
    entities = [TransactionData::class],
    version = 1,
    exportSchema = false
)
abstract class TransactionDataBase : RoomDatabase() {

    abstract fun transactionEntryDao(): TransactionRepoDao

    companion object {

        @Volatile
        private var INSTANCE: TransactionDataBase? = null

        fun getDatabase(ctx: Context): TransactionDataBase {
            return when (val temp = INSTANCE) {
                null -> synchronized(this) {
                    Room.databaseBuilder(
                        ctx.applicationContext, TransactionDataBase::class.java,
                        "TransactionInfo.db"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                }
                else -> temp
            }
        }
    }

}