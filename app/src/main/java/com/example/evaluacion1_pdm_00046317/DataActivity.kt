package com.example.evaluacion1_pdm_00046317

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_data.*
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject

class DataActivity : AppCompatActivity() {

    private lateinit var textProd1: TextView
    private lateinit var textProd2: TextView
    private lateinit var textProd3: TextView
    private lateinit var textProd4: TextView
    private lateinit var textProd5: TextView
    private lateinit var textProd6: TextView
    private lateinit var textProd7: TextView
    private lateinit var textProd8: TextView
    private lateinit var textProd9: TextView

    private lateinit var textUser: TextView
    private lateinit var textMail: TextView
    private lateinit var textTotal: TextView

    private lateinit var btnShare: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        textProd1 = count_ab
        textProd2 = count_bb
        textProd3 = count_cb
        textProd4 = count_db
        textProd5 = count_eb
        textProd6 = count_fb
        textProd7 = count_gb
        textProd8 = count_hb
        textProd9 = count_ib

        textUser = tv_user
        textMail = tv_email
        textTotal = tv_count

        btnShare = btn_share

        val mIntent = intent
        val data = JSONObject(mIntent.getStringExtra("data"))

        var suma = data.getInt("prod1")+data.getInt("prod2")+data.getInt("prod3")+data.getInt("prod4")+data.getInt("prod5")+data.getInt("prod6")+data.getInt("prod7")+data.getInt("prod8")+data.getInt("prod9")

        textProd1.text = data.getInt("prod1").toString()
        textProd2.text = data.getInt("prod2").toString()
        textProd3.text = data.getInt("prod3").toString()
        textProd4.text = data.getInt("prod4").toString()
        textProd5.text = data.getInt("prod5").toString()
        textProd6.text = data.getInt("prod6").toString()
        textProd7.text = data.getInt("prod7").toString()
        textProd8.text = data.getInt("prod8").toString()
        textProd9.text = data.getInt("prod9").toString()

        textUser.text = "Usuario: "+data.getString("user")
        textMail.text = "Correo: "+data.getString("email")
        textTotal.text = "Total de productos: "+suma

        btnShare.setOnClickListener(View.OnClickListener {

            val mImpIntent = Intent()
            mImpIntent.setAction(Intent.ACTION_SEND)
            mImpIntent.setType("text/plain")
            mImpIntent.putExtra(Intent.EXTRA_TEXT, mIntent.getStringExtra("data"))
            startActivity(mImpIntent)

        })

    }
}
