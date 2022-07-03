package spiral.bit.dev.rpgnote.repositories.achievement

import kotlinx.coroutines.flow.Flow
import spiral.bit.dev.rpgnote.data.sources.local.entities.app.AchievementEntity

interface AchievementRepository {

    suspend fun insert(achievementEntity: AchievementEntity)

    suspend fun update(achievementEntity: AchievementEntity)

    suspend fun delete(achievementEntity: AchievementEntity)

    fun observeAllAchievements(): Flow<List<AchievementEntity>>
}