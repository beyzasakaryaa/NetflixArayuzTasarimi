package com.example.netflixarayuztasarimi

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // System UI arka planlarını siyah yap
        window.statusBarColor = Color.BLACK
        window.navigationBarColor = Color.BLACK

        // Simgelerin görünmesi için light UI bayrağını kaldır
        window.decorView.systemUiVisibility = 0
    }

}
