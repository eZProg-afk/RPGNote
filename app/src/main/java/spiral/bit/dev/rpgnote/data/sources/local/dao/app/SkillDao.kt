package spiral.bit.dev.rpgnote.data.sources.local.dao.app

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import spiral.bit.dev.rpgnote.data.base.BaseDao
import spiral.bit.dev.rpgnote.data.sources.local.entities.app.SkillEntity

@Dao
interface SkillDao : BaseDao<SkillEntity> {

    @Query("SELECT * FROM skills")
    fun getAllSkills(): Flow<List<SkillEntity>>
}