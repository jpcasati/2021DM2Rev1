package com.example.a2021dm2rev1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var lista : ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSmile.setOnClickListener {
            txtHello.text = "Olá "+edtNome.text+", seja bem vindo(a)!"

            if(swtToast.isChecked)
                Toast.makeText(this, "Olá "+edtNome.text+", seja bem vindo(a)!",
                Toast.LENGTH_LONG).show()

            if(tglSalvar.isChecked)
                lista.add(edtNome.text.toString())

        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_principal, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(item.itemId == R.id.menu_listagem) {

            if(lista.isEmpty()) {
                Toast.makeText(this, "Lista Vazia",
                    Toast.LENGTH_LONG).show()
            } else {
                val i = Intent(this, ListActivity::class.java)
                i.putExtra("lista", lista)
                startActivity(i)
            }

        }

        return super.onOptionsItemSelected(item)
    }

}
