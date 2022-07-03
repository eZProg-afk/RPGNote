package spiral.bit.dev.rpgnote.data.sources.local.dao.shop

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import spiral.bit.dev.rpgnote.data.base.BaseDao
import spiral.bit.dev.rpgnote.data.sources.local.entities.shop.appDecorations.ThemeEntity

@Dao
interface ThemeDao : BaseDao<ThemeEntity> {

    @Query("SELECT * FROM themes WHERE isAlreadyBought = :isFromInventory")
    fun getAllAppThemes(isFromInventory: Boolean): Flow<List<ThemeEntity>>
}