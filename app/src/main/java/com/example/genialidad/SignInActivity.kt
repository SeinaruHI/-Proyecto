package com.example.genialidad

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.genialidad.databinding.ActivityMain3Binding
import com.example.genialidad.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val correctLogins=listOf("vano.xmao@mail.ru","lekomtsevivan2006@gmail.com")
        val correctPassword="098098098"
        
        binding.buttonStart.setOnClickListener {
            val userLogin=binding.loginEditText.text.toString()
            val userPassword=binding.passwordEditText.text.toString()
            if (correctLogins.contains(userLogin)&&correctPassword==userPassword){
                startActivity(Intent(this, MainActivity::class.java))
            }
            else {
                Toast.makeText(this, "Datos incorrectos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}