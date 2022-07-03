package spiral.bit.dev.rpgnote.di

import org.koin.core.module.Module
import org.koin.dsl.module
import spiral.bit.dev.gamificationnote.repositories.shop.appDecorations.ThemeRepository
import spiral.bit.dev.gamificationnote.repositories.shop.hero.WeaponRepository
import spiral.bit.dev.rpgnote.repositories.shop.appDecorations.DefaultThemeRepository
import spiral.bit.dev.rpgnote.repositories.shop.appFeatures.AppFeatureRepository
import spiral.bit.dev.rpgnote.repositories.shop.appFeatures.DefaultAppFeatureRepository
import spiral.bit.dev.rpgnote.repositories.shop.hero.*
import spiral.bit.dev.rpgnote.repositories.tasks.DefaultTaskRepository
import spiral.bit.dev.rpgnote.repositories.tasks.TaskRepository

val repositoryModule = module {
    bindRepositories()
}

fun Module.bindRepositories() {
    bindShopRepositories()
    bindTaskRepositories()
}

fun Module.bindShopRepositories() {
    single<AppFeatureRepository> { DefaultAppFeatureRepository(appFeatureDao = get()) }
    single<ThemeRepository> { DefaultThemeRepository(themeDao = get()) }
    single<ArmorRepository> { DefaultArmorRepository(armorDao = get()) }
    single<WeaponRepository> { DefaultWeaponRepository(weaponDao = get()) }
    single<BackgroundRepository> { DefaultBackgroundRepository(backgroundDao = get()) }
}

fun Module.bindTaskRepositories() {
    single<TaskRepository> { DefaultTaskRepository(taskDao = get()) }
}