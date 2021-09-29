package com.example.optionmenu

import android.app.Activity
import android.view.View
import android.widget.Button

class ExternalOnClickListener{
    private lateinit var acMain:Activity

    constructor(button: Button){
        acMain=Activity()
    }
    fun adActionBack(button: Button) {
        try {
            button.setOnClickListener {
                acMain.setContentView(R.layout.activity_main)
            }
        } catch (e: Exception) {
            e.printStackTrace()

        }
    }

}