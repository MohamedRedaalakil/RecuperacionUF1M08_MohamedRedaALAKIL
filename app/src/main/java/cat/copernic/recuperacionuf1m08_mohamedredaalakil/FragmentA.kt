package cat.copernic.recuperacionuf1m08_mohamedredaalakil

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cat.copernic.recuperacionuf1m08_mohamedredaalakil.database.UsuarioViewModel

class FragmentA : Fragment() {

    companion object {
        fun newInstance() = FragmentA()
    }

    private lateinit var viewModel: UsuarioViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(UsuarioViewModel::class.java)
        // TODO: Use the ViewModel
    }

}