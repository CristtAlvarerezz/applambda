package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    TabLayout tabLayout
    ViewPager viewPager
    TabItem tab1,tab2,tab3
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tablayout=findViewById(R.id.tablayout)
        viewPager=findViewById(R.id.viewPager)


        var tab1=findViewById(R.id.tabbanda)
        var tab2=findViewById(R.id.tabelectro)
        var tab3 = findViewById(R.id.tabalma)
    }
}