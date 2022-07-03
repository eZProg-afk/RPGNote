package spiral.bit.dev.rpgnote.data.sources.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import spiral.bit.dev.rpgnote.data.sources.local.dao.shop.*
import spiral.bit.dev.rpgnote.data.sources.local.entities.shop.appDecorations.ThemeEntity
import spiral.bit.dev.rpgnote.data.sources.local.entities.shop.appFeatures.AppFeatureEntity
import spiral.bit.dev.rpgnote.data.sources.local.entities.shop.hero.ArmorEntity
import spiral.bit.dev.rpgnote.data.sources.local.entities.shop.hero.BackgroundEntity
import spiral.bit.dev.rpgnote.data.sources.local.entities.shop.hero.WeaponEntity

@Database(
    entities = [
        ArmorEntity::class,
        WeaponEntity::class,
        BackgroundEntity::class,
        AppFeatureEntity::class,
        ThemeEntity::class
    ], version = 1, exportSchema = false
)
abstract class ShopDatabase : RoomDatabase() {
    abstract fun armorDao(): ArmorDao
    abstract fun weaponDao(): WeaponDao
    abstract fun backgroundDao(): BackgroundDao
    abstract fun appFeatureDao(): AppFeatureDao
    abstract fun themeDao(): ThemeDao
}