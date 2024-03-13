package mx.edu.potros.examenun2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetalleRegalos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_regalos)

        val imageViewDetalle: ImageView = findViewById(R.id.imageViewDetalle)
        val textViewPrecio: TextView = findViewById(R.id.textViewPrecio)

        val bundle = intent.extras
        if (bundle != null) {
            imageViewDetalle.setImageResource(bundle.getInt("imagenResId"))
            textViewPrecio.text = "Precio: ${bundle.getString("precio")}"
        }


    }
}
