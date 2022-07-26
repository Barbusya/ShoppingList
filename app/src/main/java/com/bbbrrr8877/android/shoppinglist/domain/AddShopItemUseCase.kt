package com.bbbrrr8877.android.shoppinglist.domain

import javax.inject.Inject

class AddShopItemUseCase@Inject constructor(
    private val shopListRepository: ShopListRepository
) {

    suspend fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }
}