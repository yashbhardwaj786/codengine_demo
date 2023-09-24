package com.codengineassessment.network

import com.codengineassessment.BuildConfig
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object NetworkModule {
    private val logging = HttpLoggingInterceptor()
    private val retrofitInstance: Retrofit = Retrofit.Builder()
        .client(
            OkHttpClient.Builder().apply {
                connectTimeout(80, TimeUnit.SECONDS)
                readTimeout(80, TimeUnit.SECONDS)
                addInterceptor { chain ->
                    val original = chain.request()
                    val originalHttpUrl = original.url

                    /**
                     * Common Query Params can be added over here
                     */
                    val url = originalHttpUrl.newBuilder()
                        .build()

                    /**
                     * Header can be added from here.
                     */
                    val request: Request = original.newBuilder()
                        .header("AUTHORIZATION", "Bearer ")
                        .url(url)
                        .build()

                    chain.proceed(request)
                }.addInterceptor(logging)
            }.build()
        )

        .baseUrl(BuildConfig.baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .build()

    val formService: FormService = retrofitInstance.create(FormService::class.java)

}
