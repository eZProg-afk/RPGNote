package spiral.bit.dev.rpgnote.data.sources.local.entities.app

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "achievements", indices = [
    Index("purpose", unique = true)
])
data class AchievementEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val purpose: String,
    val description: String,
    val currentProgress: Int,
    val maxProgress: Int,
    val rewardInMoney: Int,
    val rewardInCrystals: Int = 0
)
