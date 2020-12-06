package com.orlanti.sindy_shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_explicit_intent2.*
import kotlinx.android.synthetic.main.activity_explicit_intent2.btn_back
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_profile.*


class ExplicitIntentActivity2 : AppCompatActivity() {

    companion object{
        const val EXTRA_NAME ="extra_nama"
        const val EXTRA_EMAIL ="extra_email"
        const val EXTRA_UMUR ="extra_umur"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent2)

        lbl_nama.text = intent.getStringExtra(EXTRA_NAME)
        lbl_email.text = intent.getStringExtra(EXTRA_EMAIL)
        lbl_umur.text = intent.getStringExtra(EXTRA_UMUR)


        btn_back.setOnClickListener {
            val backItem = Intent (this@ExplicitIntentActivity2, MainActivity::class.java)
            startActivity(backItem)
        }


        }
    }
