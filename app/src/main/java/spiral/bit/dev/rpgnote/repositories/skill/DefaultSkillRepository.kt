package spiral.bit.dev.rpgnote.repositories.skill

import kotlinx.coroutines.flow.Flow
import spiral.bit.dev.rpgnote.data.sources.local.dao.app.SkillDao
import spiral.bit.dev.rpgnote.data.sources.local.entities.app.SkillEntity

class DefaultSkillRepository(private val skillDao: SkillDao) : SkillRepository {

    override suspend fun insert(skillEntity: SkillEntity) {
        skillDao.insert(skillEntity)
    }

    override suspend fun update(skillEntity: SkillEntity) {
        skillDao.update(skillEntity)
    }

    override suspend fun delete(skillEntity: SkillEntity) {
        skillDao.delete(skillEntity)
    }

    override fun observeAllSkills(): Flow<List<SkillEntity>> {
        return skillDao.getAllSkills()
    }
}