package com.codengineassessment.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\u0010R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/codengineassessment/repository/CartRepository;", "Lcom/codengineassessment/common/BaseRepository;", "transactionRepoDao", "Lcom/codengineassessment/data/db/TransactionRepoDao;", "(Lcom/codengineassessment/data/db/TransactionRepoDao;)V", "allUsers", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/codengineassessment/data/db/TransactionData;", "getAllUsers", "()Lkotlinx/coroutines/flow/Flow;", "setAllUsers", "(Lkotlinx/coroutines/flow/Flow;)V", "insert", "", "transactionInfo", "(Lcom/codengineassessment/data/db/TransactionData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public final class CartRepository extends com.codengineassessment.common.BaseRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.codengineassessment.data.db.TransactionRepoDao transactionRepoDao = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.Flow<? extends java.util.List<com.codengineassessment.data.db.TransactionData>> allUsers;
    
    public CartRepository(@org.jetbrains.annotations.NotNull()
    com.codengineassessment.data.db.TransactionRepoDao transactionRepoDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.codengineassessment.data.db.TransactionData>> getAllUsers() {
        return null;
    }
    
    public final void setAllUsers(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<? extends java.util.List<com.codengineassessment.data.db.TransactionData>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.codengineassessment.data.db.TransactionData transactionInfo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}