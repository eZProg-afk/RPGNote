package spiral.bit.dev.rpgnote.repositories.skill

import kotlinx.coroutines.flow.Flow
import spiral.bit.dev.rpgnote.data.sources.local.entities.app.SkillEntity

interface SkillRepository {

    suspend fun insert(skillEntity: SkillEntity)

    suspend fun update(skillEntity: SkillEntity)

    suspend fun delete(skillEntity: SkillEntity)

    fun observeAllSkills(): Flow<List<SkillEntity>>
}