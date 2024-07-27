package com.visoft.mango_tz.data.model.network.reponse.auth

import com.visoft.mango_tz.data.utils.BaseNetworkModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RequestCodeResponse(
    @SerialName("is_success") val isSuccess: Boolean,
): BaseNetworkModel()
