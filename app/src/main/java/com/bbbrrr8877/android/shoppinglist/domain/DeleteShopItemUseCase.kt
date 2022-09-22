package com.bbbrrr8877.android.shoppinglist.domain

import javax.inject.Inject

class DeleteShopItemUseCase@Inject constructor(
    private val shopListRepository: ShopListRepository
) {

    suspend fun deleteShopItem(shopItem: ShopItem) {
        shopListRepository.deleteShopItem(shopItem)
    }
}