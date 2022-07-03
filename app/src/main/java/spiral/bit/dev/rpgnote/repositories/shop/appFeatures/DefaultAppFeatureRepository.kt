package spiral.bit.dev.rpgnote.repositories.shop.appFeatures

import kotlinx.coroutines.flow.Flow
import spiral.bit.dev.rpgnote.data.sources.local.dao.shop.AppFeatureDao
import spiral.bit.dev.rpgnote.data.sources.local.entities.shop.appFeatures.AppFeatureEntity

class DefaultAppFeatureRepository(private val appFeatureDao: AppFeatureDao) : AppFeatureRepository {

    override suspend fun insert(appFeatureEntity: AppFeatureEntity) {
        appFeatureDao.insert(appFeatureEntity)
    }

    override suspend fun delete(appFeatureEntity: AppFeatureEntity) {
        appFeatureDao.delete(appFeatureEntity)
    }

    override suspend fun update(appFeatureEntity: AppFeatureEntity) {
        appFeatureDao.update(appFeatureEntity)
    }

    override fun observeAllAppFeatures(isFromInventory: Boolean): Flow<List<AppFeatureEntity>> {
        return appFeatureDao.getAllAppFeatures(isFromInventory)
    }
}