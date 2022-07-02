package spiral.bit.dev.rpgnote.data.base

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update

interface BaseDao<T> {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(entity: T): Long

    @Delete
    suspend fun delete(entity: T)

    @Update
    suspend fun update(entity: T)
}