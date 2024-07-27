package com.visoft.mango_tz.data.repository.auth

import com.visoft.mango_tz.data.model.network.reponse.auth.CheckAuthCodeResponse
import com.visoft.mango_tz.data.model.network.reponse.auth.RequestCodeResponse

interface AuthRepository {

    suspend fun requestAuthCode(phone: String): RequestCodeResponse

    suspend fun checkAuthCode(phone: String, code: String): CheckAuthCodeResponse
}