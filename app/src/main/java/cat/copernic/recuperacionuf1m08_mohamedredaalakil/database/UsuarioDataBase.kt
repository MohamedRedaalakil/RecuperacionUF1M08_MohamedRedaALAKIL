package cat.copernic.recuperacionuf1m08_mohamedredaalakil.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Usuario::class], version = 1, exportSchema = false)
abstract class UsuarioDataBase: RoomDatabase() {

    abstract fun usuarioDao(): UsuarioDao
    companion object {
        @Volatile
        private var INSTANCE: UsuarioDataBase? = null

        fun getDatabase(context: Context): UsuarioDataBase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UsuarioDataBase::class.java,
                    "usuario_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }

}