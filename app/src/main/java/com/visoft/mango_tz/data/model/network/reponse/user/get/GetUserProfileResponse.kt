package com.visoft.mango_tz.data.model.network.reponse.user.get

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GetUserProfileResponse(
    @SerialName("name") val name: String,
    @SerialName("username") val userName: String,
    @SerialName("birthday") val birthday: String,
    @SerialName("city") val city: String,
    @SerialName("vk") val vk: String,
    @SerialName("instagram") val instagram: String,
    @SerialName("status") val status: String,
    @SerialName("avatar") val avatar: String,
    @SerialName("id") val userId: Long,
    @SerialName("last") val lastSeen: String,
    @SerialName("online") val isOnline: Boolean,
    @SerialName("created") val createdDate: String,
    @SerialName("phone") val phone: String,
    @SerialName("completed_task") val completedTask: Int,
    @SerialName("avatars") val avatars: GetUserAvatarResponse,
)
