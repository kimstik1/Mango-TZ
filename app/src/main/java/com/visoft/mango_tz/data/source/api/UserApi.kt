package com.visoft.mango_tz.data.source.api

import com.visoft.mango_tz.data.model.network.reponse.user.get.GetUserResponse
import com.visoft.mango_tz.data.model.network.reponse.user.register.RegisterUserResponse
import com.visoft.mango_tz.data.model.network.reponse.user.update.UpdateUserProfileResponse
import com.visoft.mango_tz.data.model.network.request.UpdateUserProfileRequest
import com.visoft.mango_tz.data.utils.ApiUtils
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.POST
import retrofit2.http.PUT

interface UserApi {

    @POST("${ApiUtils.USER_API_PATH}/register")
    suspend fun registerUser(
        @Field("phone") phone: String,
        @Field("name") name: String,
        @Field("username") username: String,
    ): RegisterUserResponse

    @POST("${ApiUtils.USER_API_PATH}/me")
    suspend fun getUser(): GetUserResponse

    @PUT("${ApiUtils.USER_API_PATH}/me")
    suspend fun updateUser(
        @Body userModel: UpdateUserProfileRequest
    ): UpdateUserProfileResponse
}