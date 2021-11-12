package com.example.unidad2_ejercicio6

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

var jugadorActual = 0
var tablero = arrayOf(arrayOf("","",""), arrayOf("","",""), arrayOf("","",""))
class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            if (jugadorActual % 2 == 0) {
                button.text = "x"
                tablero[0][0] = "x"
            } else {
                button.text = "o"
                tablero[0][0] = "o"
            }
            jugadorActual++
            button.isClickable = false
            comprobarGanador()
            if (comprobarTablero()) {
                button10.visibility = View.VISIBLE
                textoGanador.text = "Nadie gana"
            }
        }
        button2.setOnClickListener {
            if (jugadorActual % 2 == 0) {
                button2.text = "x"
                tablero[0][1] = "x"
            } else {
                button2.text = "o"
                tablero[0][1] = "o"
            }
            jugadorActual++
            button2.isClickable = false
            comprobarGanador()
            if (comprobarTablero()) {
                button10.visibility = View.VISIBLE
                textoGanador.text = "Nadie gana"
            }
        }
        button3.setOnClickListener {
            if (jugadorActual % 2 == 0) {
                button3.text = "x"
                tablero[0][2] = "x"

            } else {
                button3.text = "o"
                tablero[0][2] = "o"
            }
            jugadorActual++
            button3.isClickable = false
            comprobarGanador()
            if (comprobarTablero()) {
                button10.visibility = View.VISIBLE
                textoGanador.text = "Nadie gana"
            }
        }
        button4.setOnClickListener {
            if (jugadorActual % 2 == 0) {
                button4.text = "x"
                tablero[1][2] = "x"
            } else {
                button4.text = "o"
                tablero[1][2] = "o"
            }
            jugadorActual++
            button4.isClickable = false
            comprobarGanador()
            if (comprobarTablero()) {
                button10.visibility = View.VISIBLE
                textoGanador.text = "Nadie gana"
            }
        }
        button5.setOnClickListener {
            if (jugadorActual % 2 == 0) {
                button5.text = "x"
                tablero[1][0] = "x"
            } else {
                button5.text = "o"
                tablero[1][0] = "o"
            }
            jugadorActual++
            button5.isClickable = false
            comprobarGanador()
            if (comprobarTablero()) {
                button10.visibility = View.VISIBLE
                textoGanador.text = "Nadie gana"
            }
        }
        button6.setOnClickListener {
            if (jugadorActual % 2 == 0) {
                button6.text = "x"
                tablero[1][1] = "x"

            } else {
                button6.text = "o"
                tablero[1][1] = "o"
            }
            jugadorActual++
            button6.isClickable = false
            comprobarGanador()
            if (comprobarTablero()) {
                button10.visibility = View.VISIBLE
                textoGanador.text = "Nadie gana"
            }
        }
        button7.setOnClickListener {
            if (jugadorActual % 2 == 0) {
                button7.text = "x"
                tablero[2][0] = "x"
            } else {
                button7.text = "o"
                tablero[2][0] = "o"
            }
            jugadorActual++
            button7.isClickable = false
            comprobarGanador()
            if (comprobarTablero()) {
                button10.visibility = View.VISIBLE
                textoGanador.text = "Nadie gana"
            }
        }
        button8.setOnClickListener {
            if (jugadorActual % 2 == 0) {
                button8.text = "x"
                tablero[2][1] = "x"
            } else {
                button8.text = "o"
                tablero[2][1] = "o"
            }
            jugadorActual++
            button8.isClickable = false
            comprobarGanador()
            if (comprobarTablero()) {
                button10.visibility = View.VISIBLE
                textoGanador.text = "Nadie gana"
            }
        }
        button9.setOnClickListener {
            if (jugadorActual % 2 == 0) {
                button9.text = "x"
                tablero[2][2] = "x"
            } else {
                button9.text = "o"
                tablero[2][2] = "o"
            }
            jugadorActual++
            button9.isClickable = false
            comprobarGanador()
            if (comprobarTablero()) {
                button10.visibility = View.VISIBLE
                textoGanador.text = "Nadie gana"
            }
        }
        button10.setOnClickListener {
            empezarJuego()
        }

    }
    private fun comprobarTablero() : Boolean {
        if (tablero.all { it -> it.all { it != "" } })
            return true
        return false
    }
    private fun comprobarGanador() {
        if (comprobarTablero(tablero)) {
            button.isClickable = false
            button2.isClickable = false
            button3.isClickable = false
            button4.isClickable = false
            button5.isClickable = false
            button6.isClickable = false
            button7.isClickable = false
            button8.isClickable = false
            button9.isClickable = false
            textoGanador.text =
                if (jugadorActual % 2 == 0) {
                    "Gana el jugador 'o'"
                } else {
                    "Gana el jugador 'x'"
                }
            button10.visibility = View.VISIBLE
        }
    }
    private fun empezarJuego() {
        button.isClickable = true
        button2.isClickable = true
        button3.isClickable = true
        button4.isClickable = true
        button5.isClickable = true
        button6.isClickable = true
        button7.isClickable = true
        button8.isClickable = true
        button9.isClickable = true
        button.text = ""
        button2.text = ""
        button3.text = ""
        button4.text = ""
        button5.text = ""
        button6.text = ""
        button7.text = ""
        button8.text = ""
        button9.text = ""
        textoGanador.text = ""
        jugadorActual = 0
        tablero = arrayOf(arrayOf("","",""), arrayOf("","",""), arrayOf("","",""))
        button10.visibility = View.INVISIBLE

    }
    private fun comprobarTablero(tablero: Array<Array<String>>) : Boolean {
        tablero.forEach {
            if (it[0] == it[1] && it[1] == it[2] && it[0] != "")
                return true
        }
        if (tablero[0][0] == tablero[1][0] && tablero[1][0] == tablero[2][0] && tablero[0][0] != "")
            return true
        if (tablero[0][1] == tablero[1][1] && tablero[1][1] == tablero[2][1] && tablero[0][1] != "")
            return true
        if (tablero[0][2] == tablero[1][2] && tablero[1][2] == tablero[2][2] && tablero[0][2] != "")
            return true
        if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[0][0] != "")
            return true
        if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0] && tablero[0][2] != "")
            return true
        return false
    }
}