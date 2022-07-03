package spiral.bit.dev.rpgnote.data.sources.local.entities.app

import androidx.annotation.DrawableRes
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import spiral.bit.dev.rpgnote.ui.feature.pins.PinDestination

@Entity(tableName = "pins", indices = [
    Index("pinDestination", unique = true),
    Index("name", unique = true)
])
data class PinEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    @DrawableRes val iconResourceId: Int,
    val pinDestination: PinDestination
)