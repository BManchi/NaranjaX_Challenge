package com.bmanchi.naranjaxchallenge.models

data class Response(
    val currentPage: Int,
    val orderBy: String,
    val pageSize: Int,
    val pages: Int,
    val results: List<Article>,
    val startIndex: Int,
    val status: String,
    val total: Int,
    val userTier: String
)