package spiral.bit.dev.rpgnote.repositories.shop.hero

import kotlinx.coroutines.flow.Flow
import spiral.bit.dev.gamificationnote.repositories.shop.hero.WeaponRepository
import spiral.bit.dev.rpgnote.data.sources.local.dao.shop.WeaponDao
import spiral.bit.dev.rpgnote.data.sources.local.entities.shop.hero.WeaponEntity

class DefaultWeaponRepository(private val weaponDao: WeaponDao) : WeaponRepository {

    override suspend fun insert(weaponEntity: WeaponEntity) {
        weaponDao.insert(weaponEntity)
    }

    override suspend fun delete(weaponEntity: WeaponEntity) {
        weaponDao.delete(weaponEntity)
    }

    override suspend fun update(weaponEntity: WeaponEntity) {
        weaponDao.update(weaponEntity)
    }

    override fun observeAllWeapons(isFromInventory: Boolean): Flow<List<WeaponEntity>> {
        return weaponDao.getAllWeapons(isFromInventory = isFromInventory)
    }
}