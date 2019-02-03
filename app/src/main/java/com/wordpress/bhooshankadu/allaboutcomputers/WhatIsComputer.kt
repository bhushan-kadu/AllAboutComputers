package com.wordpress.bhooshankadu.allaboutcomputers

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class WhatIsComputer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_what_is_computer)
    }

    fun click(v:View){

        when(v.tag.toString()){

            "whatIsComputer1" -> { val i = Intent(this, InfoActivity::class.java)
                i.data = Uri.parse("file:///android_asset/whatIsComputer/whatIsComputer.html")
                startActivity (i)}

            "whatIsComputer2" -> { val i = Intent(this, InfoActivity::class.java)
                i.data = Uri.parse("file:///android_asset/whatIsComputer/useOfComputer.html")
                startActivity (i)}

            "whatIsComputer3" -> { val i = Intent(this, InfoActivity::class.java)
                i.data = Uri.parse("file:///android_asset/whatIsComputer/partsOfComputer.html")
                startActivity (i)}

            "whatIsComputer4" -> { val i = Intent(this, InfoActivity::class.java)
                i.data = Uri.parse("file:///android_asset/whatIsComputer/networkOfComputer.html")
                startActivity (i)}

            "whatIsComputer5" -> { val i = Intent(this, InfoActivity::class.java)
                i.data = Uri.parse("file:///android_asset/whatIsComputer/typesOfComputer.html")
                startActivity (i)}

            "whatIsComputer6" -> { val i = Intent(this, InfoActivity::class.java)
                i.data = Uri.parse("file:///android_asset/whatIsComputer/historyOfComputer.html")
                startActivity (i)}

            "whatIsComputer7" -> { val i = Intent(this, InfoActivity::class.java)
                i.data = Uri.parse("file:///android_asset/whatIsComputer/someMoreInfo.html")
                startActivity (i)}
        }
    }
}
