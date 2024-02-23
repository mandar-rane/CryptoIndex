package com.mandar.cryptoindex.domain.repository

import com.mandar.cryptoindex.data.remote.dto.CoinDetailDto
import com.mandar.cryptoindex.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto

}