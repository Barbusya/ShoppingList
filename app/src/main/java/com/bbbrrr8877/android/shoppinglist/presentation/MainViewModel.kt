package com.bbbrrr8877.android.shoppinglist.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bbbrrr8877.android.shoppinglist.data.ShopListRepositoryImpl
import com.bbbrrr8877.android.shoppinglist.domain.DeleteShopItemUseCase
import com.bbbrrr8877.android.shoppinglist.domain.EditShopItemUseCase
import com.bbbrrr8877.android.shoppinglist.domain.GetShopListUseCase
import com.bbbrrr8877.android.shoppinglist.domain.ShopItem

class MainViewModel : ViewModel() {

    //Incorrect realisation. Don't do that. Use DI
    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem (shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }
}