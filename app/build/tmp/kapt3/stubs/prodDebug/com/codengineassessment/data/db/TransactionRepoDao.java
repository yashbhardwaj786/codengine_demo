package com.codengineassessment.data.db;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u000b\u00c0\u0006\u0001"}, d2 = {"Lcom/codengineassessment/data/db/TransactionRepoDao;", "", "getAllUsers", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/codengineassessment/data/db/TransactionData;", "user_id", "", "insert", "", "transactionInfo", "app_prodDebug"})
@androidx.room.Dao()
public abstract interface TransactionRepoDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.codengineassessment.data.db.TransactionData transactionInfo);
    
    @androidx.room.Query(value = "SELECT * FROM transaction_info where userId = :user_id")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.codengineassessment.data.db.TransactionData>> getAllUsers(int user_id);
}