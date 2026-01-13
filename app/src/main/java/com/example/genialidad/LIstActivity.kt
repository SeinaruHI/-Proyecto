package com.example.genialidad

import android.content.Intent
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
        val dataList= listOf(ExampleData(name = "Даниил", surname = "Даниилов", age = 32), ExampleData(name = "Александр", surname = "Александрович", age = 20))
        binding.mainRV.adapter= MainRVAdapter(dataList,{dataText ->
            Toast.makeText(this, dataText, Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, FragmentActivity::class.java))
        })

    }
}