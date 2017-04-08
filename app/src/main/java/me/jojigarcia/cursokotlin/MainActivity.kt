package me.jojigarcia.cursokotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import me.jojigarcia.cursokotlin.DetailActivity.Companion.EXTRA_ID

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler.layoutManager = GridLayoutManager(this,2)
        recycler.adapter = ItemAdapter(getItems()){ item ->
            val intent = Intent(this,DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_ID,item.id)
            startActivity(intent)
        }
    }
}
