package com.plcoding.cryptocurrencyappyt.domain.model

import com.plcoding.cryptocurrencyappyt.data.remote.dto.*

data class CoinDetail(
    val description: String,
    val id: String,
    val is_active: Boolean,
    val symbol: String,
    val name: String,
    val rank: Int,
    val tags: List<String>,
    val team: List<TeamMember>
)
