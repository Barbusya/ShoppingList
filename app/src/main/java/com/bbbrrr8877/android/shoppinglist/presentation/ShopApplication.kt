package com.bbbrrr8877.android.shoppinglist.presentation

import android.app.Application
import com.bbbrrr8877.android.shoppinglist.di.DaggerApplicationComponent

class ShopApplication: Application() {

    val component by lazy {
        DaggerApplicationComponent.factory().create(this)
    }
}
