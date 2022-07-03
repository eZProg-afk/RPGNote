package spiral.bit.dev.rpgnote.repositories.tasks

import kotlinx.coroutines.flow.Flow
import spiral.bit.dev.rpgnote.data.sources.local.dao.tasks.TaskDao
import spiral.bit.dev.rpgnote.data.sources.local.entities.tasks.TaskEntity

class DefaultTaskRepository(private val taskDao: TaskDao) : TaskRepository {

    override suspend fun insert(taskEntity: TaskEntity) {
        taskDao.insert(taskEntity)
    }

    override suspend fun update(taskEntity: TaskEntity) {
        taskDao.update(taskEntity)
    }

    override suspend fun delete(taskEntity: TaskEntity) {
        taskDao.delete(taskEntity)
    }

    override fun observeAllSimpleTasks(): Flow<List<TaskEntity>> {
        return taskDao.getAllTasks()
    }
}