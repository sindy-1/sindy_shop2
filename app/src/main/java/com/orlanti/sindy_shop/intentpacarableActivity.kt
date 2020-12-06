package com.orlanti.sindy_shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.orlanti.sindy_shop.model.user
import kotlinx.android.synthetic.main.activity_explicit_intent2.*
import kotlinx.android.synthetic.main.activity_main.*

class intentpacarableActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_USER="extra user"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intentpacarable)

        val user= intent.getParcelableExtra<user>(EXTRA_USER) as user

        lbl_nama.text =user.nama
        lbl_email.text =user.email
        lbl_umur.text =user.umur


        btn_back.setOnClickListener {
            val backItem = Intent (this@intentpacarableActivity, MainActivity::class.java)
            startActivity(backItem)
        }

    }
}