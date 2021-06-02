package com.sara.motionlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        OnBoardDialogFragment.newInstance("Any Description").show(supportFragmentManager, "TAG")


    }
}