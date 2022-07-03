package spiral.bit.dev.rpgnote.repositories.tasks

import kotlinx.coroutines.flow.Flow
import spiral.bit.dev.rpgnote.data.sources.local.entities.tasks.TaskEntity

interface TaskRepository {

    suspend fun insert(taskEntity: TaskEntity)

    suspend fun update(taskEntity: TaskEntity)

    suspend fun delete(taskEntity: TaskEntity)

    fun observeAllSimpleTasks(): Flow<List<TaskEntity>>
}