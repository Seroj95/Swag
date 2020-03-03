package com.example.swag.controller

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.example.swag.R
import com.example.swag.adapter.ProductsAdapter
import com.example.swag.services.DataServices
import com.example.swag.utils.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {
lateinit var adapter: ProductsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val categoryType=intent.getStringExtra(EXTRA_CATEGORY)
adapter= ProductsAdapter(this,DataServices.getProtucts(categoryType))
        val orientation=resources.configuration.orientation
        var spanCount=2
        if (orientation==Configuration.ORIENTATION_LANDSCAPE){
            spanCount=3
        }
        val scrensize=resources.configuration.screenWidthDp
        if (scrensize>720){
            spanCount=3
        }
        val layoutManager=GridLayoutManager(this,spanCount)
        productsViewCategory.layoutManager=layoutManager
        productsViewCategory.adapter=adapter
    }
}
