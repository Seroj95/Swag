package com.example.swag.services

import com.example.swag.model.Category
import com.example.swag.model.Product

object DataServices  {
    val categores = listOf(
        Category("SHIRTS","shirtone"),
        Category("HODIES","hoodieone"),
        Category("HATS","hat"),
        Category("DIGITAL","shirtttwo")


    )
    val hats= listOf(
        Product("Devs1","$18","hat1"),
        Product("Devs2","$15","hat2"),
        Product("Devs3","$17","hat3"),
        Product("Devs4","$10","hat4")

    )
    val hoodies= listOf(
        Product("Devlops hoodie Gray","$28","Hodie1"),
        Product("Devlops hoodie Red","$28","Hodie2"),
        Product("Devlops hoodie Bleack","$28","Hodie3"),
        Product("Devlops hoodie Blue","$28","Hodie4")

    )
val shirts= listOf(
    Product("Devlops shirt Gray","$28","shirt1"),
    Product("Devlops shirt Red","$28","shirt2"),
    Product("Devlops shirt Bleack","$28","shirt03"),
    Product("Devlops shirt Blue","$28","shirt4")
)
    val digitalGood= listOf<Product>()
    fun  getProtucts(category: String):List<Product>{
        return when (category){
            "SHIRTS"-> shirts
            "HATS"-> hats
            "HODIES"-> hoodies
            else -> digitalGood
        }
    }
}