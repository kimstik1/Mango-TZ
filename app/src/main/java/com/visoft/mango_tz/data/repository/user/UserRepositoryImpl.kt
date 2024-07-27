package com.visoft.mango_tz.data.repository.user

import com.visoft.mango_tz.data.model.network.reponse.user.get.GetUserResponse
import com.visoft.mango_tz.data.model.network.reponse.user.register.RegisterUserResponse
import com.visoft.mango_tz.data.model.network.reponse.user.update.UpdateUserProfileResponse
import com.visoft.mango_tz.data.model.network.request.UpdateUserProfileRequest
import com.visoft.mango_tz.data.source.api.UserApi

class UserRepositoryImpl(
    private val userApi: UserApi
): UserRepository {

    override suspend fun registerUser(
        phone: String,
        name: String,
        username: String
    ): RegisterUserResponse = userApi.registerUser(phone = phone, name = name, username = username)

    override suspend fun getUser(): GetUserResponse =
        userApi.getUser()

    override suspend fun updateUser(
        userModel: UpdateUserProfileRequest
    ): UpdateUserProfileResponse = userApi.updateUser(userModel = userModel)
}