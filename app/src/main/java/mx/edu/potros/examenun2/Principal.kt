package mx.edu.potros.examenun2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)


        val detallesButton: Button = findViewById(R.id.Detalles)


        detallesButton.setOnClickListener {

            val intent = Intent(this, Regalos::class.java)
            startActivity(intent)
        }


    }
}
