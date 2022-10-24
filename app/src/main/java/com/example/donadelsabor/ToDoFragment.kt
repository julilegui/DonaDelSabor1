package com.example.donadelsabor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class ToDoFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?)

    {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val fragmento = inflater.inflate(R.layout.fragment_to_do, container,false)
        val btnSancocho:Button=fragmento.findViewById(R.id.btn_sancocho)
        val btnBocachico:Button=fragmento.findViewById(R.id.btn_bocachico)
        val btnChicharron:Button=fragmento.findViewById(R.id.btn_chicharron)
        val btnCazuela:Button=fragmento.findViewById(R.id.btn_cazuela)
        val btnCayeye:Button=fragmento.findViewById(R.id.btn_Cayeye)
        btnSancocho.setOnClickListener {View.OnClickListener {

            val datos=Bundle()
            datos.putString("Plato","Sancocho de pescado")
            datos.putString("Plato","Viuda de bocachico")
            datos.putString("Plato","Chicharron de pescado")
            datos.putString("Plato","Cazuela de mariscos")
            datos.putString("Plato","Cayeye")







            activity?.getSupportFragmentManager()?.beginTransaction()
                    ?.setReorderingAllowed(true)
                    ?.replace(R.id.fcv,DetailFragment::class.java,datos,"Primer plato")

        }

        }

        return fragmento

    }
}


