package com.example.donadelsabor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class DetailFragment:Fragment() {

    override fun onCreate(savedInstanceState: Bundle?)

    {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val fragmento = inflater.inflate(R.layout.fragment_detail, container,false)

        //Textos de Sancocho
        var titulo =requireArguments().getString("Titulo")
        var plato =requireArguments().getString("Plato")
        var precio =requireArguments().getString("Precio")


        //Textos de Bocachico
        var TituloBocachico =requireArguments().getString("TituloBocahcico")
        var PlatoBocachico =requireArguments().getString("PlatoBocachico")
        var PrecioBocachico =requireArguments().getString("PrecioBocachico")
        //var cayeye =requireArguments().getString("cayeye")

        var tvTitulo: TextView = fragmento.findViewById(R.id.tvSancocho)
        var tvPlato: TextView = fragmento.findViewById(R.id.tvMenuSancocho)
        var tvPrecio: TextView = fragmento.findViewById(R.id.tvPrecioSancocho)

        var tvTituloBocachico: TextView = fragmento.findViewById(R.id.tvBocachico)
        var tvPlatoBocachico: TextView = fragmento.findViewById(R.id.tvMenuBocachico)
        var tvPrecioBocachico: TextView = fragmento.findViewById(R.id.tvPrecioBocachico)


        //var tvBocachico: TextView = fragmento.findViewById(R.id.tvBocachico)
        //var tvChicharron: TextView = fragmento.findViewById(R.id.tvChicharron)
        //var tvCazuela: TextView = fragmento.findViewById(R.id.tvCazuela)
        //var tvCayeye: TextView = fragmento.findViewById(R.id.tvCayeye)

        tvTitulo.text = titulo
        tvPlato.text = plato
        tvPrecio.text = precio

        tvTituloBocachico.text = TituloBocachico
        tvPlatoBocachico.text = PlatoBocachico
        tvPrecioBocachico.text = PrecioBocachico




        //tvBocachico.text = bocachico
        //tvChicharron.text = chicharron
        //tvCazuela.text = cazuela
        //tvCayeye.text = cayeye

        return fragmento
    }

}