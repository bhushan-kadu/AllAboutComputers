package com.wordpress.bhooshankadu.allaboutcomputers

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import android.content.ActivityNotFoundException




//Main Activity Which will be the homepage of App

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu,menu)
        menu!!.findItem(R.id.menu_share)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        if(item.toString().equals("share")){
            val i = Intent(Intent.ACTION_SEND)
            i.type = "text/plain"
            val putExtra = i.putExtra(Intent.EXTRA_SUBJECT, "Computer Fundamentals")
            val message = "Computer Fundamentals\nहे अॅप इंस्टॉल करा आणी मराठी मधून मिळवा कम्प्युटर विषयी सर्व माहिती. \n *https://bit.ly/2S59nOO* \n\n"

            i.putExtra(Intent.EXTRA_TEXT, message)
            startActivity(Intent.createChooser(i, "choose one"))

        }
        if(item.toString().equals("Rate App")){
            val uri = Uri.parse("market://details?id=" + packageName)
            val goToMarket = Intent(Intent.ACTION_VIEW, uri)
            // To count with Play market backstack, After pressing back button,
            // to taken back to our application, we need to add following flags to intent.
            goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY or
                    Intent.FLAG_ACTIVITY_NEW_DOCUMENT or
                    Intent.FLAG_ACTIVITY_MULTIPLE_TASK)
            try {
                startActivity(goToMarket)
            } catch (e: ActivityNotFoundException) {
                startActivity(Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://play.google.com/store/apps/details?id=" + packageName)))
            }

        }
        return super.onOptionsItemSelected(item)
    }

//Sub-pages will be opened when clicked on this function buttons
    fun click(v: View){

        when(v.tag.toString()) {

            "whatiscomputer" -> startActivity (Intent(this, WhatIsComputer::class.java))

            "problems_and_solutions" ->{ val i = Intent(this, InfoActivity::class.java)
                i.data = Uri.parse("file:///android_asset/problemsAndSolution/problemsAndSolution.html")
                startActivity (i)}

            "Format_Computer" ->{val i = Intent(this, InfoActivity::class.java)
            i.data = Uri.parse("file:///android_asset/formatComputer/formatComputer.html")
                    startActivity (i)}

            "turnOff_Computer" ->{ val i = Intent(this, InfoActivity::class.java)
                i.data = Uri.parse("file:///android_asset/openAndCloseComputer/openAndCloseComputer.html")
                startActivity (i)}




   }

    }
}
