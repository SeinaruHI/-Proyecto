package com.example.genialidad

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.genialidad.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .replace(binding.fragmentHolder.id, FirstFragment())
            .commit()

        binding.bottomNav.setOnItemSelectedListener{ item ->
            when(item.itemId){
                R.id.item1 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(binding.fragmentHolder.id, FirstFragment())
                        .commit()
                    true
                }
                R.id.item2 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(binding.fragmentHolder.id, SecondFragment())
                        .commit()
                    true
                }
                else -> false
            }
        }
    }
}