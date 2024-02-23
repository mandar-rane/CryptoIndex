package com.mandar.cryptoindex.data.repository

import com.mandar.cryptoindex.data.remote.CoinPaprikaApi
import com.mandar.cryptoindex.data.remote.dto.CoinDetailDto
import com.mandar.cryptoindex.data.remote.dto.CoinDto
import com.mandar.cryptoindex.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository{
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }

}