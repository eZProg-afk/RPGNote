package spiral.bit.dev.rpgnote.data.sources.local.entities.shop.hero

import androidx.annotation.DrawableRes
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import spiral.bit.dev.rpgnote.R
import spiral.bit.dev.rpgnote.ui.common.dto.shop.ItemRarity

@Entity(
    tableName = "backgrounds", indices = [
        Index("name", unique = true),
        Index("description", unique = true),
        Index("imageResource", unique = true)
    ]
)
data class BackgroundEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val isAlreadyBought: Boolean = false,
    val name: String,
    val description: String,
    val rarity: ItemRarity = ItemRarity.COMMON,
    @DrawableRes val imageResource: Int,
    val priceInMoney: Int,
    val priceInCrystals: Int
)
