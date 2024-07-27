package com.visoft.mango_tz.data.model.network.reponse.user.update

import com.visoft.mango_tz.data.utils.BaseNetworkModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UpdateUserProfileResponse(
    @SerialName("avatars") val avatars: UpdateUserAvatarResponse,
): BaseNetworkModel()