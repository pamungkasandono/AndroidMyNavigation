package com.example.androidmynavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val fm: FragmentManager = supportFragmentManager
//        val fragment = HomeFragment()
//        fm.beginTransaction().replace(R.id.container, fragment).commit()
    }
}