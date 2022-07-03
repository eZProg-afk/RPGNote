package spiral.bit.dev.rpgnote.data.sources.local.dao.shop

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import spiral.bit.dev.rpgnote.data.base.BaseDao
import spiral.bit.dev.rpgnote.data.sources.local.entities.shop.hero.ArmorEntity
import spiral.bit.dev.rpgnote.data.sources.local.entities.shop.hero.BackgroundEntity

@Dao
interface BackgroundDao : BaseDao<BackgroundEntity> {

    @Query("SELECT * FROM backgrounds WHERE isAlreadyBought = :isFromInventory")
    fun getAllBackgrounds(isFromInventory: Boolean): Flow<List<BackgroundEntity>>
}