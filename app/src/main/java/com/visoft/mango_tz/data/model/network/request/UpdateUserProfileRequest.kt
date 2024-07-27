package com.visoft.mango_tz.data.model.network.request

import com.visoft.mango_tz.data.utils.BaseNetworkModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UpdateUserProfileRequest(
    @SerialName("name") val name: String,
    @SerialName("username") val userName: String,
    @SerialName("birthday") val birthday: String,
    @SerialName("city") val city: String,
    @SerialName("vk") val vk: String,
    @SerialName("instagram") val instagram: String,
    @SerialName("status") val status: String,
    @SerialName("avatar") val avatar: UpdateUserAvatarRequest,
): BaseNetworkModel()
