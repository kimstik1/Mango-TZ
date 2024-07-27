package com.visoft.mango_tz.data.repository.token

import com.visoft.mango_tz.data.model.network.reponse.auth.RefreshTokenResponse

interface TokenRepository {

    suspend fun refreshToken(refreshToken: String): RefreshTokenResponse
}