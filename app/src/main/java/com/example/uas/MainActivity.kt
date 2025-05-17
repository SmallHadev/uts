package com.example.uas

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnSubmit= findViewById<Button>(R.id.main_btn_Submit)
        val etUsername= findViewById<EditText>(R.id.main_et_Username)
        val etPW= findViewById<EditText>(R.id.main_et_PW)

        btnSubmit.setOnClickListener {
        val Username= etUsername.text.toString().trim()
        val PW= etPW.text.toString().trim()

            if (Username.isNotEmpty()&&PW.isNotEmpty()){
                Toast.makeText(this, "Login berhasil ${Username} :)", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()
            } else
                Toast.makeText(this, "Ups! Kamu belum mengisi semua", Toast.LENGTH_SHORT).show()
        }
    }

}