package com.innovorder.testtechnique

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GetAllDucksResponse(
    @Json(name = "ducks")
    val ducks: List<Duck>
)
