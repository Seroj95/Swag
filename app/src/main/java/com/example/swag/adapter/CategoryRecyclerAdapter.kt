package com.example.swag.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.swag.R
import com.example.swag.model.Category

class CategoryRecyclerAdapter(
    val context: Context,
    val categories: List<Category>,
    val itemClick: (Category) -> Unit
) :
    RecyclerView.Adapter<CategoryRecyclerAdapter.Holder>() {

    inner class Holder(itemView: View,val itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView) {
        val categoriesImage = itemView.findViewById<ImageView>(R.id.caregoryImage)
        val categoryName = itemView.findViewById<TextView>(R.id.categoryName)
        fun bindCategory(category: Category, context: Context) {
            //
            val recourceId =
                context.resources.getIdentifier(category.image, "drawable", context.packageName)
            categoriesImage?.setImageResource(recourceId)
            //
            categoryName.text = category.title
itemView.setOnClickListener {
    itemClick(category)
}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_item_view, parent, false)
        return Holder(view,itemClick)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindCategory(categories[position], context)

    }
}