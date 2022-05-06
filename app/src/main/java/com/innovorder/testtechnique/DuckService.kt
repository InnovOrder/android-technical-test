package com.innovorder.testtechnique

import retrofit2.Call
import retrofit2.http.GET

interface DuckService {

    @GET("971a9a64-e934-4c27-b6e9-4b6c1cdb9c67")
    fun getAllDucks(): Call<GetAllDucksResponse>

}
