package spiral.bit.dev.rpgnote.data.sources.local.dao.app

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import spiral.bit.dev.rpgnote.data.base.BaseDao
import spiral.bit.dev.rpgnote.data.sources.local.entities.app.AchievementEntity

@Dao
interface AchievementDao : BaseDao<AchievementEntity> {

    @Query("SELECT * FROM achievements")
    fun getAllAchievements(): Flow<List<AchievementEntity>>
}