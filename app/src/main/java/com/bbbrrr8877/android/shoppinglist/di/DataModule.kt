package com.bbbrrr8877.android.shoppinglist.di

import android.app.Application
import com.bbbrrr8877.android.shoppinglist.data.AppDatabase
import com.bbbrrr8877.android.shoppinglist.data.ShopListDao
import com.bbbrrr8877.android.shoppinglist.data.ShopListRepositoryImpl
import com.bbbrrr8877.android.shoppinglist.domain.ShopListRepository
import dagger.Binds
import dagger.Module
import dagger.Provides


@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindShopListRepository(impl: ShopListRepositoryImpl): ShopListRepository

    companion object {

        @ApplicationScope
        @Provides
        fun providesShopListDao(
            application: Application
        ): ShopListDao {
            return AppDatabase.getInstance(application).shopListDao()
        }
    }
}
