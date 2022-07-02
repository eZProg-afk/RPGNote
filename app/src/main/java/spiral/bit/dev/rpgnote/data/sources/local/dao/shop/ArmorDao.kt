package spiral.bit.dev.rpgnote.data.sources.local.dao.shop

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import spiral.bit.dev.rpgnote.data.base.BaseDao
import spiral.bit.dev.rpgnote.data.sources.local.entities.shop.hero.ArmorEntity

@Dao
interface ArmorDao : BaseDao<ArmorEntity> {

    @Query("SELECT * FROM armor")
    fun getAllArmor(): Flow<List<ArmorEntity>>
}