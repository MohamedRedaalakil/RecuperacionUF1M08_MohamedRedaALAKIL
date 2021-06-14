package cat.copernic.recuperacionuf1m08_mohamedredaalakil.database

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Tabla_usuario")
data class Usuario (
    @PrimaryKey val nombre:String,
                val email: String,
                val password: String
)