package com.visoft.mango_tz.data.repository.user

import com.visoft.mango_tz.data.model.network.reponse.user.get.GetUserResponse
import com.visoft.mango_tz.data.model.network.reponse.user.register.RegisterUserResponse
import com.visoft.mango_tz.data.model.network.reponse.user.update.UpdateUserProfileResponse
import com.visoft.mango_tz.data.model.network.request.UpdateUserProfileRequest

interface UserRepository {

    suspend fun registerUser(phone: String, name: String, username: String): RegisterUserResponse

    suspend fun getUser(): GetUserResponse

    suspend fun updateUser(userModel: UpdateUserProfileRequest): UpdateUserProfileResponse
}