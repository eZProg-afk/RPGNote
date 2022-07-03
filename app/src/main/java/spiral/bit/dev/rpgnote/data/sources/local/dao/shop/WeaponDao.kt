package spiral.bit.dev.rpgnote.data.sources.local.dao.shop

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import spiral.bit.dev.rpgnote.data.base.BaseDao
import spiral.bit.dev.rpgnote.data.sources.local.entities.shop.hero.WeaponEntity

@Dao
interface WeaponDao : BaseDao<WeaponEntity> {

    @Query("SELECT * FROM weapons WHERE isAlreadyBought = :isFromInventory")
    fun getAllWeapons(isFromInventory: Boolean): Flow<List<WeaponEntity>>
}