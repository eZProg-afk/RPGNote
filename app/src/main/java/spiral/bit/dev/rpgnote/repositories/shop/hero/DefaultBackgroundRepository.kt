package spiral.bit.dev.rpgnote.repositories.shop.hero

import kotlinx.coroutines.flow.Flow
import spiral.bit.dev.rpgnote.data.sources.local.dao.shop.BackgroundDao
import spiral.bit.dev.rpgnote.data.sources.local.entities.shop.hero.BackgroundEntity

class DefaultBackgroundRepository(private val backgroundDao: BackgroundDao) : BackgroundRepository {

    override suspend fun insert(backgroundEntity: BackgroundEntity) {
        backgroundDao.insert(backgroundEntity)
    }

    override suspend fun delete(backgroundEntity: BackgroundEntity) {
        backgroundDao.delete(backgroundEntity)
    }

    override suspend fun update(backgroundEntity: BackgroundEntity) {
        backgroundDao.update(backgroundEntity)
    }

    override fun observeAllBackgrounds(isFromInventory: Boolean): Flow<List<BackgroundEntity>> {
        return backgroundDao.getAllBackgrounds(isFromInventory)
    }
}