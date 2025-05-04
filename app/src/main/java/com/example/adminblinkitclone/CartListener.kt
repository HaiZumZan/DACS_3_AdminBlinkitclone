package com.example.adminblinkitclone

interface CartListener {

    fun showCartLayout(itemCount : Int)

    fun savinCartItemCount(itemCount: Int)

    fun hideCartLayout()

}