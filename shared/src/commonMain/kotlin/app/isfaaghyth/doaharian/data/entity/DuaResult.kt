package app.isfaaghyth.doaharian.data.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DuaResult(
    @SerialName("status")
    val status: Int,

    @SerialName("data")
    val data: List<Dua>,
)