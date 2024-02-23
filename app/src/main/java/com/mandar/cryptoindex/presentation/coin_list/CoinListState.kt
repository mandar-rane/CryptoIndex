package com.mandar.cryptoindex.presentation.coin_list

import com.mandar.cryptoindex.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
