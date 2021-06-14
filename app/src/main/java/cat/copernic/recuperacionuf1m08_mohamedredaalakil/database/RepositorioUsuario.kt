package cat.copernic.recuperacionuf1m08_mohamedredaalakil.database

import androidx.lifecycle.LiveData
import cat.copernic.recuperacionuf1m08_mohamedredaalakil.database.UsuarioDao
import cat.copernic.recuperacionuf1m08_mohamedredaalakil.database.Usuario

class RepositorioUsuario (private val usuarioDao: UsuarioDao) {

    val readAllData: LiveData<List<Usuario>> = usuarioDao.readAllData()

    suspend fun addUser(usuario: Usuario) {
        usuarioDao.addUser(usuario)

    }

    suspend fun updateUser(usuario: Usuario) {
        usuarioDao.updateUser(usuario)

    }

    suspend fun userLogin(email: String, password: String) {
        usuarioDao.userLogin(email, password)
    }


}