package com.example.evaluacion1_pdm_00046317

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var prod1: Int = 0
    private var prod2: Int = 0
    private var prod3: Int = 0
    private var prod4: Int = 0
    private var prod5: Int = 0
    private var prod6: Int = 0
    private var prod7: Int = 0
    private var prod8: Int = 0
    private var prod9: Int = 0

    private lateinit var textProd1: TextView
    private lateinit var textProd2: TextView
    private lateinit var textProd3: TextView
    private lateinit var textProd4: TextView
    private lateinit var textProd5: TextView
    private lateinit var textProd6: TextView
    private lateinit var textProd7: TextView
    private lateinit var textProd8: TextView
    private lateinit var textProd9: TextView

    private lateinit var txtUser: EditText
    private lateinit var txtEmail: EditText

    private lateinit var btnSend : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textProd1 = count_a
        textProd2 = count_b
        textProd3 = count_c
        textProd4 = count_d
        textProd5 = count_e
        textProd6 = count_f
        textProd7 = count_g
        textProd8 = count_h
        textProd9 = count_i

        txtUser = txt_user
        txtEmail = txt_email

        btnSend = btn_enviar

        textProd1.setOnClickListener(View.OnClickListener {

            prod1++
            textProd1.text = prod1.toString()

        })
        textProd2.setOnClickListener(View.OnClickListener {

            prod2++
            textProd2.text = prod2.toString()

        })
        textProd3.setOnClickListener(View.OnClickListener {

            prod3++
            textProd3.text = prod3.toString()

        })
        textProd4.setOnClickListener(View.OnClickListener {

            prod4++
            textProd4.text = prod4.toString()

        })
        textProd5.setOnClickListener(View.OnClickListener {

            prod5++
            textProd5.text = prod5.toString()

        })
        textProd6.setOnClickListener(View.OnClickListener {

            prod6++
            textProd6.text = prod6.toString()

        })
        textProd7.setOnClickListener(View.OnClickListener {

            prod7++
            textProd7.text = prod7.toString()

        })
        textProd8.setOnClickListener(View.OnClickListener {

            prod8++
            textProd8.text = prod8.toString()

        })
        textProd9.setOnClickListener(View.OnClickListener {

            prod9++
            textProd9.text = prod9.toString()

        })

        btnSend.setOnClickListener(View.OnClickListener {

            if (txtUser.text.toString() != "" && txtEmail.text.toString() != ""){
                val mIntent = Intent(this@MainActivity, DataActivity::class.java)
                var textToSend = "{ user: \""+txtUser.text.toString()+"\", email: \""+txtEmail.text.toString()+"\", prod1: "+prod1+", prod2: "+prod2+", prod3: "+prod3+", prod4: "+prod4+", prod5: "+prod5+", prod6: "+prod6+", prod7: "+prod7+", prod8: "+prod8+", prod9: "+prod9+" }"
                mIntent.putExtra("data", textToSend)
                startActivity(mIntent)
            }

        })

    }

}
