package spiral.bit.dev.rpgnote.repositories.shop.hero

import kotlinx.coroutines.flow.Flow
import spiral.bit.dev.rpgnote.data.sources.local.entities.shop.hero.BackgroundEntity

interface BackgroundRepository {

    suspend fun insert(backgroundEntity: BackgroundEntity)

    suspend fun delete(backgroundEntity: BackgroundEntity)

    suspend fun update(backgroundEntity: BackgroundEntity)

    fun observeAllBackgrounds(isFromInventory: Boolean): Flow<List<BackgroundEntity>>
}