package com.visoft.mango_tz.data.model.network.reponse.user.get

import com.visoft.mango_tz.data.utils.BaseNetworkModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GetUserResponse (
    @SerialName("profile_data") val userProfile: GetUserProfileResponse,
): BaseNetworkModel()