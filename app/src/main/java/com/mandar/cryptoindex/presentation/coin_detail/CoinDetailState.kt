package com.mandar.cryptoindex.presentation.coin_detail

import com.mandar.cryptoindex.domain.model.Coin
import com.mandar.cryptoindex.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null ,
    val error: String = ""
)
