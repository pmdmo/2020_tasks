package es.iessaladillo.pedrojoya.tasks_app.data

import android.annotation.SuppressLint
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import es.iessaladillo.pedrojoya.tasks_app.data.entity.Task
import java.text.SimpleDateFormat
import java.util.*

object Database : DataSource {

    // TODO
    override fun queryAllTasksLiveData(): LiveData<List<Task>> {
    }

    // TODO
    override fun addTask(concept: String, category: String) {
    }

    // TODO
    override fun insertTask(task: Task) {
    }

    // TODO
    override fun deleteTask(taskId: Long) {
    }

    // TODO
    override fun deleteTasks(taskIdList: List<Long>) {
    }

    // TODO
    override fun markTaskAsCompleted(taskId: Long) {
    }

    // TODO
    override fun markTasksAsCompleted(taskIdList: List<Long>) {
    }

    // TODO
    override fun markTaskAsPending(taskId: Long) {
    }

    // TODO
    override fun markTasksAsPending(taskIdList: List<Long>) {
    }

}
