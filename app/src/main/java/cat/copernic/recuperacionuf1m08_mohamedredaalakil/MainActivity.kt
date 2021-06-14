package cat.copernic.recuperacionuf1m08_mohamedredaalakil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupActionBarWithNavController(findNavController(R.id.fragmentB))

    }

    override fun onSupportNavigateUp(): Boolean {
        val navigateContriler = findNavController(R.id.fragmentB)
        return navigateContriler.navigateUp() || super.onSupportNavigateUp()
    }
}