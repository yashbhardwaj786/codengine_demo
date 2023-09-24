package com.codengineassessment.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0006"}, d2 = {"Lcom/codengineassessment/network/FormService;", "", "generateDogImages", "Lretrofit2/Response;", "Lcom/codengineassessment/data/model/DogBreedResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public abstract interface FormService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "breeds/image/random")
    public abstract java.lang.Object generateDogImages(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.codengineassessment.data.model.DogBreedResult>> continuation);
}