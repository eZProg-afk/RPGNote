package spiral.bit.dev.rpgnote.di

import android.content.Context
import androidx.room.Room
import org.koin.core.module.Module
import org.koin.dsl.module
import spiral.bit.dev.rpgnote.R
import spiral.bit.dev.rpgnote.data.sources.local.database.AppDatabase
import spiral.bit.dev.rpgnote.data.sources.local.database.ShopDatabase
import spiral.bit.dev.rpgnote.data.sources.local.database.TaskDatabase

fun databaseModule(applicationContext: Context) = module {
    bindDao()
    bindDatabase(applicationContext)
}

fun Module.bindDatabase(applicationContext: Context) {
    single {
        Room.databaseBuilder(
            applicationContext,
            TaskDatabase::class.java,
            applicationContext.getString(R.string.task_database_name)
        ).build()
    }

    single {
        Room.databaseBuilder(
            applicationContext,
            ShopDatabase::class.java,
            applicationContext.getString(R.string.shop_database_name)
        ).build()
    }

    single {
        Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            applicationContext.getString(R.string.app_database_name)
        ).build()
    }
}

fun Module.bindDao() {
    bindAppDao()
    bindTasksDao()
    bindShopDao()
}

fun Module.bindAppDao() {
    single { get<AppDatabase>().achievementsDao() }
    single { get<AppDatabase>().pinDao() }
    single { get<AppDatabase>().skillDao() }
}

fun Module.bindTasksDao() {
    single { get<TaskDatabase>().taskDao() }
}

fun Module.bindShopDao() {
    single { get<ShopDatabase>().weaponDao() }
    single { get<ShopDatabase>().armorDao() }
    single { get<ShopDatabase>().backgroundDao() }
    single { get<ShopDatabase>().themeDao() }
    single { get<ShopDatabase>().appFeatureDao() }
}