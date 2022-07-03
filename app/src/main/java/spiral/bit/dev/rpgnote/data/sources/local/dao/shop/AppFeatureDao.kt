package spiral.bit.dev.rpgnote.data.sources.local.dao.shop

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import spiral.bit.dev.rpgnote.data.base.BaseDao
import spiral.bit.dev.rpgnote.data.sources.local.entities.shop.appFeatures.AppFeatureEntity

@Dao
interface AppFeatureDao : BaseDao<AppFeatureEntity> {

    @Query("SELECT * FROM app_features WHERE isAlreadyBought = :isFromInventory")
    fun getAllAppFeatures(isFromInventory: Boolean): Flow<List<AppFeatureEntity>>
}