package com.armandoc.g.Adapters
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.armandoc.g.databinding.ItemPerritoBinding
import com.example.perroapp.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PerritoAdapter(private var perrito : ArrayList<Perro>) : RecyclerView.Adapter<PerritoAdapter.ViewHolderUsuario>() {

    inner class ViewHolderUsuario(val binding : ItemPerroBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(perrito: Perrito) {

            binding.apply {

                viewnombreperrito.text = perrito.nombre
                textViewRaza.text = perrito.raza
                textViewEdad.text = perrito.edad
                textViewEdad.text = perrito.sexo

                BotonAlerta.setOnClickListener {

                    Snackbar.make(binding.root, perrito.nombre, 1000).show()

                }

            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderUsuario {

        val binding = ItemPerritoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolderUsuario(binding)

    }

    override fun onBindViewHolder(holder: ViewHolderUsuario, position: Int) {

        holder.bind(perrito[position])

    }

    override fun getItemCount(): Int {

        return perrito.size

    }

    fun updateUsuarios(nuevosPerritos : ArrayList<Perrito>) {

        perro = nuevosPerritos
        this.notifyDataSetChanged()

    }

}

    }

}

