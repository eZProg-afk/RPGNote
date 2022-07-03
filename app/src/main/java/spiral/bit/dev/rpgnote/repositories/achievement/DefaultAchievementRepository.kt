package spiral.bit.dev.rpgnote.repositories.achievement

import kotlinx.coroutines.flow.Flow
import spiral.bit.dev.rpgnote.data.sources.local.dao.app.AchievementDao
import spiral.bit.dev.rpgnote.data.sources.local.entities.app.AchievementEntity

class DefaultAchievementRepository(private val achievementDao: AchievementDao) :
    AchievementRepository {

    override suspend fun insert(achievementEntity: AchievementEntity) {
        achievementDao.insert(achievementEntity)
    }

    override suspend fun update(achievementEntity: AchievementEntity) {
        achievementDao.update(achievementEntity)
    }

    override suspend fun delete(achievementEntity: AchievementEntity) {
        achievementDao.delete(achievementEntity)
    }

    override fun observeAllAchievements(): Flow<List<AchievementEntity>> {
        return achievementDao.getAllAchievements()
    }
}