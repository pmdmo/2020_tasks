package es.iessaladillo.pedrojoya.tasks_app.ui.addTask

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import es.iessaladillo.pedrojoya.tasks_app.R
import es.iessaladillo.pedrojoya.tasks_app.base.observeEvent
import es.iessaladillo.pedrojoya.tasks_app.data.Database
import es.iessaladillo.pedrojoya.tasks_app.databinding.AddTaskActivityBinding
import es.iessaladillo.pedrojoya.tasks_app.utils.hideKeyboard

class AddTaskActivity : AppCompatActivity() {

    // NO TOCAR

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.add_task_activity, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.mnuSave) {
            onSave()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    // ---- FIN NO TOCAR

    // TODO: Código en respuesta a que el usuario ha pulsado el icono de guardar
    private fun onSave() {
    }

}