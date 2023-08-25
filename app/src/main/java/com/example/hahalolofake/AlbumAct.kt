package com.example.hahalolofake

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hahalolofake.databinding.ActAlbumBinding

import com.example.hahalolofake.utils.UserAdapter

class AlbumAct : AppCompatActivity() {
    private lateinit var binding: ActAlbumBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActAlbumBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val images = listOf(
            R.drawable.img_2,
            R.drawable.img_2,
            R.drawable.img_2,
            R.drawable.img_2,
            R.drawable.img_2,
            R.drawable.img_3,
            R.drawable.img_3,
            R.drawable.img_3,
            R.drawable.img_3,
            R.drawable.img_3,
            R.drawable.img_4,
            R.drawable.img_4,
            R.drawable.img_4,
            R.drawable.img_4,
            R.drawable.img_4,
            R.drawable.img_2,
            R.drawable.img_2,
            R.drawable.img_2,
            R.drawable.img_2,
            R.drawable.img_2,
            R.drawable.img_2,
            R.drawable.img_2,
            R.drawable.img_2,
            R.drawable.img_2,
            R.drawable.img_2,
            R.drawable.img_3,
            R.drawable.img_3,
            R.drawable.img_3,
            R.drawable.img_3,
        )

        val userAdapter = UserAdapter(this, images)

        val spanCount = 3
        binding.recyclerView.layoutManager = GridLayoutManager(this,spanCount)
        binding.recyclerView.adapter = userAdapter
    }
}
