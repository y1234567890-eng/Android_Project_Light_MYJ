package com.yousufjamil.testsqldatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val findBtn = findViewById<Button>(R.id.findBtn)

        findBtn.setOnClickListener {
            val idToFind = findViewById<EditText>(R.id.idEt).text.toString()
            if (idToFind == "") {
                Toast.makeText(this, "Please enter an ID", Toast.LENGTH_SHORT).show()
            } else {
                val backgroundWorker = BackgroundWorker(this)
                backgroundWorker.execute("fetchData", idToFind)
            }
        }
    }
}