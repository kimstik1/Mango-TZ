package com.visoft.mango_tz.data.source.api

import com.visoft.mango_tz.data.model.network.reponse.auth.RefreshTokenResponse
import com.visoft.mango_tz.data.utils.ApiUtils
import retrofit2.http.Field
import retrofit2.http.POST

interface TokenApi {

    @POST("${ApiUtils.USER_API_PATH}/refresh-token")
    suspend fun refreshToken(
        @Field("refresh_token") token: String
    ): RefreshTokenResponse
}