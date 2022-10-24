package com.example.donadelsabor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ToDoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to_do)

        if (savedInstanceState==null) {

            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()

            val fragment = ToDoFragment()
            fragmentTransaction.add(R.id.fcv, fragment)
            fragmentTransaction.commit()


          //  supportFragmentManager.beginTransaction().setReorderingAllowed(true).add(R.id.fcv,ToDoFragment::class.java,null,"todo").commit()


        }

    }
}