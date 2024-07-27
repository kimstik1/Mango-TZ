package com.visoft.mango_tz.data.model.network.reponse.user.register

import com.visoft.mango_tz.data.utils.BaseNetworkModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RegisterUserResponse(
    @SerialName("refresh_token") val refreshToken: String,
    @SerialName("access_token") val accessToken: String,
    @SerialName("user_id") val userId: Int,
): BaseNetworkModel()
