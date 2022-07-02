package spiral.bit.dev.rpgnote.data.sources.local.entities.app

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "skills", indices = [
    Index("title", unique = true)
])
data class SkillEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val currentLevel: Int,
    val maxLevel: Int,
    val pointsToNextLevel: Int
)
