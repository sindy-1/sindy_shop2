package com.orlanti.sindy_shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import com.orlanti.sindy_shop.model.user
import kotlinx.android.synthetic.main.activity_main.*
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_profile.setOnClickListener {
            val Profile = Intent(this@MainActivity, ProfileActivity::class.java)
            startActivity(Profile)
        }
        btn_produk.setOnClickListener {
          val Produk = Intent(this@MainActivity, ExplicitIntentActivity2::class.java)
            Produk.putExtra(ExplicitIntentActivity2.EXTRA_NAME, "Tresia Sindi orlanti")
            Produk.putExtra(ExplicitIntentActivity2.EXTRA_EMAIL, "tsindiorlanti@gmail.com")
            Produk.putExtra(ExplicitIntentActivity2.EXTRA_UMUR, "20 tahun")
            startActivity(Produk)
        }
        btn_produk_with_data.setOnClickListener {
            val ProdukwithData = Intent(this@MainActivity, intentpacarableActivity::class.java)
            val user= user ("Tresia Sindi orlanti", "tsindiorlanti", "20 tahun")
            ProdukwithData.putExtra(intentpacarableActivity.EXTRA_USER, user)
            startActivity(ProdukwithData)
        }
    }
}