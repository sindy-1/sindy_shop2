package com.orlanti.sindy_shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        btn_back.setOnClickListener {
            val backItem = Intent (this@ProfileActivity, MainActivity::class.java)
            startActivity(backItem)
        }
    }
}