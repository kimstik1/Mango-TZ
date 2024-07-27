package com.visoft.mango_tz.data.utils

import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@OptIn(ExperimentalSerializationApi::class)
@Serializable
open class BaseNetworkModel (
    @SerialName("detail")
    @EncodeDefault
    val details: List<NetworkError> = emptyList()
)

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class NetworkError(

    @SerialName("loc")
    @EncodeDefault
    val localization: String,

    @SerialName("msg")
    @EncodeDefault
    val message: String,

    @SerialName("type")
    @EncodeDefault
    val type: String,
)