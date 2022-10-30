package com.example.donadelsabor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView

class ToDoFragment : Fragment() {

    private lateinit var listRecyclerView: RecyclerView
    private lateinit var myAdapter: RecyclerView.Adapter<MyTaskListAdapter.MyViewHolder>

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

    /*    val btnSancocho:Button=fragmento.findViewById(R.id.btn_sancocho)
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
        })*/

        return fragmento
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var myTaskTitles: ArrayList<String> = ArrayList()
        var myTaskContents: ArrayList<String> = ArrayList()
        var myTaskPlaces: ArrayList<String> = ArrayList()
        myTaskTitles.add("Sancocho de pescado")
        myTaskTitles.add("Viudo de pescado")
        myTaskContents.add("Sopa con pescado y verduras")
        myTaskPlaces.add("Restaurante")
        var info: Bundle=Bundle()

        info.putStringArrayList("titles", myTaskTitles)
        info.putStringArrayList("contents", myTaskContents)
        info.putStringArrayList("places", myTaskPlaces)
        listRecyclerView = requireView().findViewById(R.id.recyclerToDoList)
        myAdapter = MyTaskListAdapter(activity as AppCompatActivity,info)
        listRecyclerView.setHasFixedSize(true)
        listRecyclerView.adapter = myAdapter
        listRecyclerView.addItemDecoration(DividerItemDecoration(context,DividerItemDecoration.VERTICAL))

    }
}


