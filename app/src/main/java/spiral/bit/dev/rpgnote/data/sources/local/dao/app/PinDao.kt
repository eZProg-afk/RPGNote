package spiral.bit.dev.rpgnote.data.sources.local.dao.app

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import spiral.bit.dev.rpgnote.data.base.BaseDao
import spiral.bit.dev.rpgnote.data.sources.local.entities.app.PinEntity

@Dao
interface PinDao : BaseDao<PinEntity> {

    @Query("SELECT * FROM pins")
    fun getAllPins(): Flow<List<PinEntity>>
}