package com.yourpackage.whatsapp_guardian

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class ReportActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report)

        val numberInput = findViewById<EditText>(R.id.editPhoneNumber)
        val reportTypeSpinner = findViewById<Spinner>(R.id.spinnerReportType)
        val sendButton = findViewById<Button>(R.id.btnSendReport)

        val types = arrayOf("انتحال شخصية", "سبام", "تهديد", "محتوى غير لائق", "تحرش")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, types)
        reportTypeSpinner.adapter = adapter

        sendButton.setOnClickListener {
            val number = numberInput.text.toString().trim()
            val type = reportTypeSpinner.selectedItem.toString()

            if (number.isNotEmpty()) {
                Toast.makeText(this, "تم إرسال البلاغ على $number بنوع: $type", Toast.LENGTH_LONG).show()
                // هنا تضيف الكود اللي ينفذ البلاغ الفعلي
            } else {
                Toast.makeText(this, "يرجى إدخال رقم صحيح", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
