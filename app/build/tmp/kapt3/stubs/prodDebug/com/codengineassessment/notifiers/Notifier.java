package com.codengineassessment.notifiers;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\rJ \u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ3\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\t0\u0012R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/codengineassessment/notifiers/Notifier;", "", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "flow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/codengineassessment/notifiers/Notify;", "close", "", "notify", "event", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "delayMillis", "", "receive", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "app_prodDebug"})
@kotlinx.coroutines.ExperimentalCoroutinesApi()
public final class Notifier {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope viewModelScope = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.codengineassessment.notifiers.Notify> flow = null;
    
    public Notifier(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope viewModelScope) {
        super();
    }
    
    public final void notify(@org.jetbrains.annotations.NotNull()
    com.codengineassessment.notifiers.Notify event, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext coroutineContext) {
    }
    
    public final void notify(@org.jetbrains.annotations.NotNull()
    com.codengineassessment.notifiers.Notify event, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext coroutineContext, long delayMillis) {
    }
    
    public final void receive(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext coroutineContext, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.codengineassessment.notifiers.Notify, kotlin.Unit> callback) {
    }
    
    public final void close() {
    }
}