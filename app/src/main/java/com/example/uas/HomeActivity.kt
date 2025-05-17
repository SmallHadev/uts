package com.example.uas

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)


        val btnMiwon=findViewById<LinearLayout>(R.id.main_btn_MIWON)
        val btnPizza=findViewById<LinearLayout>(R.id.main_btn_PIZZA)
        val btnBurger=findViewById<LinearLayout>(R.id.main_btn_BURGER)

        btnMiwon.setOnClickListener {
            startActivity(Intent(this, Detail1Activity::class.java))

        }

        btnPizza.setOnClickListener {
            startActivity(Intent(this, Detail2Activity::class.java))

        }

        btnBurger.setOnClickListener {
            startActivity(Intent(this, Detail3Activity::class.java))

        }
        }
}