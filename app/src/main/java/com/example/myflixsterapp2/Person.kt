package com.example.myflixsterapp2

import com.google.gson.annotations.SerializedName


class Person{

    @JvmField

    @SerializedName("known_for")
    var knownFor: Details? = null

    @SerializedName("overview")
    var overview: Details? = null

    @SerializedName("name")
    var name: String? = null

    @SerializedName("profile_path")
    var profilePath: String? = null

}

data class Details(
    @SerializedName("poster_path")
    val imageUrl: String? = null,

    @SerializedName("original_title")
    val title: String?,

    @SerializedName("overView")
    var overview: String? = null,

    @SerializedName("backdrop_path")
    var backdrop: String? = null

) : java.io.Serializable
