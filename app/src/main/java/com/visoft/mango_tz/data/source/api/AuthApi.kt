package com.visoft.mango_tz.data.source.api

import com.visoft.mango_tz.data.model.network.reponse.auth.CheckAuthCodeResponse
import com.visoft.mango_tz.data.model.network.reponse.auth.RequestCodeResponse
import com.visoft.mango_tz.data.utils.ApiUtils
import retrofit2.http.Field
import retrofit2.http.POST

interface AuthApi {

    @POST("${ApiUtils.USER_API_PATH}/send-auth-code")
    suspend fun requestCode(
        @Field("phone") phone: String,
    ): RequestCodeResponse

    @POST("${ApiUtils.USER_API_PATH}/check-auth_code")
    suspend fun checkCode(
        @Field("phone") phone: String,
        @Field("code") code: String,
    ): CheckAuthCodeResponse
}