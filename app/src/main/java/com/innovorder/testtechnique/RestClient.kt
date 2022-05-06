package com.innovorder.testtechnique

import com.innovorder.testtechnique.BuildConfig.BASE_URL_API
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class RestClient {

    private val client = Retrofit.Builder()
        .baseUrl(BASE_URL_API)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    fun getDuckService(): DuckService = client.create(DuckService::class.java)
}
