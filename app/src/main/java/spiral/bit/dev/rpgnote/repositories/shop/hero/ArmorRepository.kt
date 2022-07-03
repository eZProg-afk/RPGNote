package spiral.bit.dev.rpgnote.repositories.shop.hero

import kotlinx.coroutines.flow.Flow
import spiral.bit.dev.rpgnote.data.sources.local.entities.shop.hero.ArmorEntity

interface ArmorRepository {

    suspend fun insert(armorEntity: ArmorEntity)

    suspend fun delete(armorEntity: ArmorEntity)

    suspend fun update(armorEntity: ArmorEntity)

    fun observeAllArmor(isFromInventory: Boolean): Flow<List<ArmorEntity>>
}