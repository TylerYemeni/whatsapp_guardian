package com.yourpackage.whatsapp_guardian

import android.os.Bundle import androidx.appcompat.app.AppCompatActivity import android.widget.Toast import android.content.Intent import android.widget.Button

class MainActivity : AppCompatActivity() { override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState) setContentView(R.layout.activity_main)

val reportButton = findViewById<Button>(R.id.btn_report)
    val logsButton = findViewById<Button>(R.id.btn_logs)
    val settingsButton = findViewById<Button>(R.id.btn_settings)

    reportButton.setOnClickListener {
        val intent = Intent(this, ReportActivity::class.java)
        startActivity(intent)
    }

    logsButton.setOnClickListener {
        val intent = Intent(this, LogsActivity::class.java)
        startActivity(intent)
    }

    settingsButton.setOnClickListener {
        val intent = Intent(this, SettingsActivity::class.java)
        startActivity(intent)
    }
}

}

