package com.innovorder.testtechnique

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Duck(
    val name: String,
    val image: String,
    val color: String,
)
