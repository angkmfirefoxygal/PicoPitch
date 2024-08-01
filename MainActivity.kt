package com.example.picopitch_ver0

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val rv_board = findViewById<RecyclerView>(R.id.rv_board)


        val itemList = ArrayList<HotPtDataClass>()

        itemList.add(HotPtDataClass("2024/08/01","월급 두배로 받는법","김XX","16"))
        itemList.add(HotPtDataClass("2024/08/01","월급 두배로 받는법","김XX","16"))
        itemList.add(HotPtDataClass("2024/08/01","월급 두배로 받는법","김XX","16"))
        itemList.add(HotPtDataClass("2024/08/01","월급 두배로 받는법","김XX","16"))




        val boardAdapter = HotPtAdapter(itemList)
        boardAdapter.notifyDataSetChanged()

        rv_board.adapter = boardAdapter
        rv_board.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}