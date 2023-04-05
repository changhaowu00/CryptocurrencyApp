package com.plcoding.cryptocurrencyappyt.presentation

sealed class Screen (val route: String){
    object CoinListScreen: Screen("coin_list_creen")
    object CoinDetailScreen: Screen("coin_detail_screen")
}
