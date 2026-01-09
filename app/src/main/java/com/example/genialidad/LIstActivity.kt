package com.example.genialidad

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.genialidad.databinding.ActivityListBinding
import com.example.genialidad.databinding.ActivitySignInBinding

class LIstActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.mainRV.layoutManager= LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.mainRV.adapter= MainRVAdapter(listOf("GGGGG","SSSSS","AAAAA","DDDDD","LLLLL"),{dataText ->
            Toast.makeText(this, dataText, Toast.LENGTH_SHORT).show()
        })

    }
}