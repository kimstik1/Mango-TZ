package com.visoft.mango_tz.data.model.network.reponse.user.get

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GetUserAvatarResponse(
    @SerialName("avatar") val avatar: String,
    @SerialName("bigAvatar") val bigAvatar: String,
    @SerialName("miniAvatar") val miniAvatar: String,
)