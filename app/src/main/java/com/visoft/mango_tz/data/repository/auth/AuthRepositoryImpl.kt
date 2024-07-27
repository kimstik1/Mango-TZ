package com.visoft.mango_tz.data.repository.auth

import com.visoft.mango_tz.data.model.network.reponse.auth.CheckAuthCodeResponse
import com.visoft.mango_tz.data.model.network.reponse.auth.RequestCodeResponse
import com.visoft.mango_tz.data.source.api.AuthApi

class AuthRepositoryImpl(
    private val authApi: AuthApi
): AuthRepository {

    override suspend fun requestAuthCode(phone: String): RequestCodeResponse =
        authApi.requestCode(phone = phone)

    override suspend fun checkAuthCode(phone: String, code: String): CheckAuthCodeResponse =
        authApi.checkCode(phone = phone, code = code)
}