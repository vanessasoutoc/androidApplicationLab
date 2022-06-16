package br.com.android.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun clickButton(view: View) {
        val textFirst = findViewById<TextView>(R.id.textView)
        textFirst.text = "Atualizado"
    }
}