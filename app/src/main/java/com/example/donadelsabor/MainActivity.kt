package com.example.donadelsabor

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private var edtUsername:EditText?=null
    private var edtPassword: TextInputEditText?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //si vas a usar tu propia toolbar, entonces debes anular la default, en el manisfet
        // windowActionBar -> false
        setSupportActionBar(findViewById(R.id.my_toolbar))
        edtUsername = findViewById(R.id.edtUsername)
        edtPassword = findViewById(R.id.edtPassword)
    }

    fun onLogin(btnLogin: View) {

        val messagePassword=getString(R.string.messagepassword)//este donde se usa?
        val messageUser= getString(R.string.message_user)
        var username: String=edtUsername !!.text.toString()//No me esta capturando el nombre del usuario. preguntar. y tambien consultar como se hacen las otras pantallas. como se saca la vista de preferencias de idioma?

        if (username=="juliana@correo.com")
        //edtUsername!!.text.toString()=="juliana@correo.com" || edtUsername!!.text.toString()=="andrea@correo.com"
        {
            if (edtPassword!!.text.toString() == "12345")

            {
                val negativeButton={_:DialogInterface,_:Int ->}
                val positiveButton={ dialog: DialogInterface, which: Int->
                    val intent = Intent(this, WelcomeActivity::class.java)
                    startActivity(intent)
                }

                val dialog = AlertDialog.Builder(this)
                    .setTitle("Welcome")
                    .setMessage("User"+ username)
                    .setPositiveButton("ok", positiveButton)
                    .setNegativeButton("Cancelar",negativeButton)
                    .create()
                    .show()



            } else {
                val dialog = AlertDialog.Builder(this)
                    .setTitle("Error")
                    .setMessage("Invalid password")
                    .create()
                    .show()
            }
        }

        else {
            /*val dialog = AlertDialog.Builder(this)
                    .setTitle("Error")
                    .setMessage("Invalid user")
                    .create()
                    .show()*/
            Toast.makeText(this, messageUser,Toast.LENGTH_LONG).show()
        }

    }








}