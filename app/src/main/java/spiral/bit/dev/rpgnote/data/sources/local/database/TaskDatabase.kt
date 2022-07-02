package spiral.bit.dev.rpgnote.data.sources.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import spiral.bit.dev.rpgnote.data.sources.local.dao.tasks.TaskDao
import spiral.bit.dev.rpgnote.data.sources.local.entities.tasks.TaskEntity

@Database(entities = [TaskEntity::class], version = 1, exportSchema = false)
abstract class TaskDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}