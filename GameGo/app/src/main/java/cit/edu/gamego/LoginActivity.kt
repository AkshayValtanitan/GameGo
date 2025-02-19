package cit.edu.gamego

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_f3)

        val registerButton = findViewById<Button>(R.id.registerButton)
        registerButton.setOnClickListener{
            Log.e("CSIT 284", "Absolute Cinema")
            Toast.makeText(this,"Absolute Sigma", Toast.LENGTH_LONG).show()

            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}