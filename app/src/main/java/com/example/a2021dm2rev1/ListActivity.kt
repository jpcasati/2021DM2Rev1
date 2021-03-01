package com.example.a2021dm2rev1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val lista = intent.getStringArrayListExtra("lista").toArray()

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, lista)

        lstPresenca.adapter = adapter

    }
}
