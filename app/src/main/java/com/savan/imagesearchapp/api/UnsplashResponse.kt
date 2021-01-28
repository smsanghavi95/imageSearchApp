package com.savan.imagesearchapp.api

import com.savan.imagesearchapp.data.UnsplashPhoto

data class UnsplashResponse (
    val results: List<UnsplashPhoto>
        )