package com.example.progressdialog

import android.app.Dialog
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onclik(view: View) {
         val dialog = Dialog(this)
            dialog.setContentView(R.layout.dialog_loading)
      //  dialog.setCancelable(false)
        if(dialog.window !=null){
            dialog!!.window!!.setBackgroundDrawable(ColorDrawable(0))
        }
        dialog.show()
    }
}