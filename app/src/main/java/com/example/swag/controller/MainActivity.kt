package com.example.swag.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.swag.R
import com.example.swag.adapter.CategoryAdapter
import com.example.swag.adapter.CategoryRecyclerAdapter
import com.example.swag.model.Category
import com.example.swag.services.DataServices
import com.example.swag.utils.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter: CategoryRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryRecyclerAdapter(this, DataServices.categores){category->
           val productIntent =Intent(this,ProductActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY,category.title)
            startActivity(productIntent)
        }

        listViewCategory.adapter = adapter
val layoutManager=LinearLayoutManager(this)
        listViewCategory.layoutManager=layoutManager
        listViewCategory.setHasFixedSize(true)
        listViewCategory.setOnClickListener {

        }
    }
}

