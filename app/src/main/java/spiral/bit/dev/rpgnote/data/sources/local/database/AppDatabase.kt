package spiral.bit.dev.rpgnote.data.sources.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import spiral.bit.dev.rpgnote.data.sources.local.dao.app.AchievementDao
import spiral.bit.dev.rpgnote.data.sources.local.dao.app.PinDao
import spiral.bit.dev.rpgnote.data.sources.local.dao.app.SkillDao
import spiral.bit.dev.rpgnote.data.sources.local.entities.app.AchievementEntity
import spiral.bit.dev.rpgnote.data.sources.local.entities.app.PinEntity
import spiral.bit.dev.rpgnote.data.sources.local.entities.app.SkillEntity

@Database(
    entities = [
        SkillEntity::class,
        AchievementEntity::class,
        PinEntity::class
    ], version = 1, exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun skillDao(): SkillDao
    abstract fun achievementsDao(): AchievementDao
    abstract fun pinDao(): PinDao
}