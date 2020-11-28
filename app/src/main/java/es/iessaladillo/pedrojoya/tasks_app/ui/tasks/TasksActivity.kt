package es.iessaladillo.pedrojoya.tasks_app.ui.tasks

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import es.iessaladillo.pedrojoya.tasks_app.R
import es.iessaladillo.pedrojoya.tasks_app.base.observeEvent
import es.iessaladillo.pedrojoya.tasks_app.data.Database
import es.iessaladillo.pedrojoya.tasks_app.data.entity.Task
import es.iessaladillo.pedrojoya.tasks_app.databinding.TasksActivityBinding
import es.iessaladillo.pedrojoya.tasks_app.ui.addTask.AddTaskActivity
import es.iessaladillo.pedrojoya.tasks_app.utils.goneUnless
import es.iessaladillo.pedrojoya.tasks_app.utils.invisibleUnless
import es.iessaladillo.pedrojoya.tasks_app.utils.setOnSwipeListener

class TasksActivity : AppCompatActivity() {

    // NO TOCAR

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.tasks_activity, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.mnuFilter -> viewModel.toggleFilterPanel()
            R.id.mnuAdd -> viewModel.onAddTask()
            R.id.mnuDelete -> viewModel.deleteTasks()
            R.id.mnuComplete -> viewModel.markAllTasksAsCompleted()
            R.id.mnuPending -> viewModel.markAllTasksAsPending()
            else -> return super.onOptionsItemSelected(item)
        }
        return true
    }

    // --- FIN NO TOCAR

    // DEBEMOS TENER EN CUENTA QUE EL FILTRADO NO SE HARÁ CONSULTANDO DE NUEVO
    // A LA BASE DE DATOS, SINO QUE SE REALIZARÁ EN LA ACTIVIDAD CADA VEZ QUE
    // SE RECIBA LA LISTA DE TAREAS O CADA VEZ QUE CAMBIE EL FILTRO A APLICAR.
    // LA LISTA RESULTANTE DEL FILTRADO DEBERÁ SER ENTREGADA AL ADAPTADOR.
    // ESTO NO ES LO MÁS ÓPTIMO, PERO ES LA ÚNICA FORMA DE HACERLO CON LO QUE
    // SABEMOS HASTA AHORA.

    // SI LA APLICACÓN, ESTANDO EN SEGUNDO PLANO ES MATADA POR FALTA DE RECURSOS,
    // CUANDO SE VUELVA A ABRIR, LA ACTIVIDAD DE TAREAS DEBE APARECER CON EL FILTRO
    // QUE TENÍA ANTES DE SER DESTRUÍDO Y CON EL PANEL DE FILTRO TAL Y COMO
    // ESTABA ANTES (VISIBLE O NO VISIBLE).

    // EN EL ADAPTADOR CUANDO VAYAS A MARCAR COMO CHEQUEADO O NO EL CHECKBOX
    // PARA INDICAR SI LA TAREA ESTÁ COMPLETADA O NO, DEBES ANULAR
    // PREVIAMENTE EL LISTENER (ponerlo a null), PARA QUE NO SE LANCE EL CÓDIGO
    // COMO SI EL USUARIO LO HUBIERA PULSADO, Y LUEGO VOLVER A ESTABLECER EL LISTENER.

    // LA NAVEGACIÓN Y EL MOSTRADO DE LOS MENSAJES DEBE HACER DESDE LA ACTIVIDAD
    // PERO LA LÓGICA DE DECISIÓN DEBE RESIDIR EN EL VIEWMODEL.

}

