package app.isfaaghyth.doaharian.data.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Dua(
    @SerialName("name")
    val name: String,

    @SerialName("latin")
    val latin: String,

    @SerialName("translation")
    val translation: String,
)