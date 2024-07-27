package com.visoft.mango_tz.data.model.network.request

import com.visoft.mango_tz.data.utils.BaseNetworkModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UpdateUserAvatarRequest (
    @SerialName("filename") val fileName: String,
    @SerialName("base_64") val base64: String,
): BaseNetworkModel()