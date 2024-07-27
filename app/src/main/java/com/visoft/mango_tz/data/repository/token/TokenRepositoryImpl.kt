package com.visoft.mango_tz.data.repository.token

import com.visoft.mango_tz.data.model.network.reponse.auth.RefreshTokenResponse
import com.visoft.mango_tz.data.source.api.TokenApi

class TokenRepositoryImpl(
    private val tokenApi: TokenApi
): TokenRepository {

    override suspend fun refreshToken(refreshToken: String): RefreshTokenResponse =
        tokenApi.refreshToken(token = refreshToken)
}