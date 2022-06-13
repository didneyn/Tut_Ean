package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import mundo.dividir
import mundo.multiplicar
import mundo.restar
import mundo.sumar
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_suma = findViewById<Button>(R.id.btnsuma)
        val button_resta = findViewById<Button>(R.id.btnresta)
        val button_multiplicacion = findViewById<Button>(R.id.btnmultiplicacion)
        val button_division = findViewById<Button>(R.id.btndivision)

        val txtnumerouno = findViewById<EditText>(R.id.txtnum_uno)
        val txtnumerodos = findViewById<EditText>(R.id.txtnum_dos)

        val txtresultado = findViewById<TextView>(R.id.txt_view_result_main)


        button_suma.setOnClickListener{
            try {
                val numero1 = txtnumerouno.text.toString().toDouble()
                val numero2 = txtnumerodos.text.toString().toDouble()
                val result = sumar(numero1,numero2).toString()
                txtresultado.setText(result)
            }catch (e :Exception){
                Toast.makeText(this, e.message,Toast.LENGTH_LONG).show()
            }
        }
        button_resta.setOnClickListener{
            try {
                val numero1 = txtnumerouno.toString().toDouble()
                val numero2 = txtnumerodos.toString().toDouble()
                val result = restar(numero1,numero2).toString()
                txtresultado.setText(result)
            }catch (e :Exception){
                Toast.makeText(this, e.message,Toast.LENGTH_LONG).show()
            }
        }
        button_multiplicacion.setOnClickListener{
            try {
                val numero1 = txtnumerouno.toString().toDouble()
                val numero2 = txtnumerodos.toString().toDouble()
                val result = multiplicar(numero1,numero2).toString()
                txtresultado.setText(result)
            }catch (e :Exception){
                Toast.makeText(this, e.message,Toast.LENGTH_LONG).show()
            }
        }
        button_division.setOnClickListener{
            try {
                val numero1 = txtnumerouno.toString().toDouble()
                val numero2 = txtnumerodos.toString().toDouble()
                val result = dividir(numero1,numero2).toString()
                txtresultado.setText(result)
            }catch (e :Exception){
                Toast.makeText(this, e.message,Toast.LENGTH_LONG).show()
            }
        }
    }

}