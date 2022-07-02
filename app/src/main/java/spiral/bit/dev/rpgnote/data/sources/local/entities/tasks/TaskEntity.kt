package spiral.bit.dev.rpgnote.data.sources.local.entities.tasks

import androidx.annotation.DrawableRes
import androidx.room.Entity
import androidx.room.PrimaryKey
import spiral.bit.dev.rpgnote.ui.common.dto.task.TaskDifficult

@Entity(tableName = "tasks")
data class TaskEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String = "",
    @DrawableRes val iconResourceId: Int,
    val taskDifficult: TaskDifficult
)
