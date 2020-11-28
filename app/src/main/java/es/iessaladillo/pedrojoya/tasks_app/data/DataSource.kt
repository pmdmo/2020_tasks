package es.iessaladillo.pedrojoya.tasks_app.data

import androidx.lifecycle.LiveData
import es.iessaladillo.pedrojoya.tasks_app.data.entity.Task

// NO TOCAR

// Interfaz que contiene los métodos con los que se interactúa con la fuente de datos
interface DataSource {

    // Retorna un LiveData con todas las tareas de la fuente de datos
    fun queryAllTasksLiveData(): LiveData<List<Task>>

    // Crea una nueva tarea a partir del concepto recibido y
    // la agrega a la fuente de datos. La tarea inicialmente no está completada y
    // createdAt será la fecha y hora actual.
    fun addTask(concept: String, category: String)

    // Agrega la tarea recibida a la fuente de datos
    fun insertTask(task: Task)

    // Borra de la fuente de datos la tarea cuyo id corresponde con
    // el recibido.
    fun deleteTask(taskId: Long)

    // Borra de la fuente de datos todas las tareas cuyos id estén contenidos
    // en la lista recibida
    fun deleteTasks(taskIdList: List<Long>)

    // Marca como completada en la fuente de datos la tarea cuyo id
    // corresponde con el recibido. completedAt pasa a ser la fecha y hora actual.
    fun markTaskAsCompleted(taskId: Long)

    // Marca como completadas en la fuente de datos todas las tareas
    // cuyos id estén contenidos en la lista recibida
    fun markTasksAsCompleted(taskIdList: List<Long>)

    // Marca como pendiente la tarea cuyo id corresponde con
    // el recibido. completedAt pasa a ser cadena vacía.
    fun markTaskAsPending(taskId: Long)

    // Marca como pendientes todas las tareas cuyos id estén contenidos
    // en la lista recibida
    fun markTasksAsPending(taskIdList: List<Long>)

}
