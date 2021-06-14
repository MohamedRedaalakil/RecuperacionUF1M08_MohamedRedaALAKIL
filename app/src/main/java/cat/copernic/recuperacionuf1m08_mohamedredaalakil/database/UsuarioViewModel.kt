package cat.copernic.recuperacionuf1m08_mohamedredaalakil.database

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UsuarioViewModel (application: Application) : AndroidViewModel(application) {
    val readAllData: LiveData<List<Usuario>>
    private val repository: RepositorioUsuario

    init {
        val userDao = UsuarioDataBase.getDatabase(application).usuarioDao()
        repository = RepositorioUsuario(userDao)
        readAllData = repository.readAllData

    }

    fun addUser(usuario: Usuario) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.addUser(usuario)

        }
    }

    fun updateUser(usuario: Usuario) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.updateUser(usuario)

        }
    }
    fun userLogin(usuario: Usuario) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.updateUser(usuario)

        }
    }
}