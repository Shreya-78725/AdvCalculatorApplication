package com.example.advcalculatorapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText





class CalculatorActivity : AppCompatActivity() {
    var res = findViewById<EditText>(R.id.result)
    var res1 = findViewById<EditText>(R.id.result1)
    var b7 = findViewById<Button>(R.id.btn7)
    var b8 = findViewById<Button>(R.id.btn8)
    var b9 = findViewById<Button>(R.id.btn9)
    var bmul = findViewById<Button>(R.id.btnx)

    var b4 = findViewById<Button>(R.id.btn4)
    var b5 = findViewById<Button>(R.id.btn5)
    var b6 = findViewById<Button>(R.id.btn6)
    var bminus = findViewById<Button>(R.id.btnminus)

    var b1 = findViewById<Button>(R.id.btn1)
    var b2 = findViewById<Button>(R.id.btn2)
    var b3 = findViewById<Button>(R.id.btn3)
    var bplus = findViewById<Button>(R.id.btnp)

    var b0 = findViewById<Button>(R.id.btn0)
    var bc = findViewById<Button>(R.id.btnclear)
    var bequal = findViewById<Button>(R.id.btnequal)
    var bdiv = findViewById<Button>(R.id.btndiv)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        b1.setOnClickListener { appendOn("1", true) }
        b2.setOnClickListener { appendOn("2", true) }
        b3.setOnClickListener { appendOn("3", true) }
        b4.setOnClickListener { appendOn("4", true) }
        b5.setOnClickListener { appendOn("5", true) }
        b6.setOnClickListener { appendOn("6", true) }
        b7.setOnClickListener { appendOn("7", true) }
        b8.setOnClickListener { appendOn("8", true) }
        b9.setOnClickListener { appendOn("9", true) }
        b0.setOnClickListener { appendOn("0", true) }

        bplus.setOnClickListener { appendOn("+", false) }
        bminus.setOnClickListener { appendOn("-", false) }
        bmul.setOnClickListener { appendOn("*", false) }
        bdiv.setOnClickListener { appendOn("/", false) }

        bequal.setOnClickListener {
            val answer = ExpressionBuilder(res.text.toString()).build()
            res1.setText(answer.toString())
        }
    }



    fun appendOn(str: String, canClear: Boolean) {

        if (canClear) {
            res1.setText("")
            res.append(str)
        } else {
            res.append(res1.text)
            res.append(str)
            res1.setText("")
        }
    }
}