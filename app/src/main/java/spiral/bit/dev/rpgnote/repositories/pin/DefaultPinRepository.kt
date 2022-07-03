package spiral.bit.dev.rpgnote.repositories.pin

import kotlinx.coroutines.flow.Flow
import spiral.bit.dev.rpgnote.data.sources.local.dao.app.PinDao
import spiral.bit.dev.rpgnote.data.sources.local.entities.app.PinEntity

class DefaultPinRepository(private val pinDao: PinDao) : PinRepository {

    override suspend fun insert(pinEntity: PinEntity) {
        pinDao.insert(pinEntity)
    }

    override suspend fun update(pinEntity: PinEntity) {
        pinDao.update(pinEntity)
    }

    override suspend fun delete(pinEntity: PinEntity) {
        pinDao.delete(pinEntity)
    }

    override fun observeAllPins(): Flow<List<PinEntity>> {
        return pinDao.getAllPins()
    }
}