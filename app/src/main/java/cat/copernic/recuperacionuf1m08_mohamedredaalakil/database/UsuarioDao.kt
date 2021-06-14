package cat.copernic.recuperacionuf1m08_mohamedredaalakil.database

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface UsuarioDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addUser(usuario: Usuario)

    @Query("SELECT * FROM Tabla_usuario ")
    fun readAllData(): LiveData<List<Usuario>>

    @Query("SELECT * FROM Tabla_usuario WHERE email=(:email) and password=(:password)")
    fun userLogin(email: String, password: String): Usuario

    @Update
    suspend fun updateUser(usuario: Usuario)

}