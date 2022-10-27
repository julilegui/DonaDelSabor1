package com.example.donadelsabor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

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

        //Boton de sancocho
        btnSancocho.setOnClickListener (View.OnClickListener {

            val datos=Bundle()
            datos.putString("Titulo","Sancocho de pescado")
            datos.putString("Plato","Sopa con bagre y arroz")
            datos.putString("Precio","$20000")
            datos.putString("Imagen","@drawable/sancochodepescado.jpg")


            activity
                    ?.supportFragmentManager?.beginTransaction()
                    ?.setReorderingAllowed(true)
                    ?.replace(R.id.fcv, DetailFragment::class.java, datos, "DetailFragment")
                    ?.addToBackStack(null)
                    ?.commit()
        })

        btnBocachico.setOnClickListener (View.OnClickListener {

            val datos=Bundle()
            datos.putString("Titulo","Viuda de bocachico")
            datos.putString("Plato","Bocachico con yuca, mazorca, arracacha y arroz")
            datos.putString("Precio","$25000")



            activity
                ?.supportFragmentManager?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(R.id.fcv, DetailFragment::class.java, datos, "DetailFragment")
                ?.addToBackStack(null)
                ?.commit()
        })


        return fragmento

    }
}


