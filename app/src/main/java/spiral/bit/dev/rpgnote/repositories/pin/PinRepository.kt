package spiral.bit.dev.rpgnote.repositories.pin

import kotlinx.coroutines.flow.Flow
import spiral.bit.dev.rpgnote.data.sources.local.entities.app.PinEntity

interface PinRepository {

    suspend fun insert(pinEntity: PinEntity)

    suspend fun update(pinEntity: PinEntity)

    suspend fun delete(pinEntity: PinEntity)

    fun observeAllPins(): Flow<List<PinEntity>>
}