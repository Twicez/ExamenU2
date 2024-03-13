package mx.edu.potros.examenun2

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import mx.edu.potros.examenun2.R

class Regalos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regalos)

        val detallesRegalos = listOf(
            Detalles(R.drawable.regalos, "Precio 1"),
            Detalles(R.drawable.cumplebotanas, "Precio 2"),
            Detalles(R.drawable.peluchesony, "Precio 3"),
            Detalles(R.drawable.peluchepeppa, "Precio 4"),
            Detalles(R.drawable.peluchemario, "Precio 5"),
            Detalles(R.drawable.regalocajas, "Precio 6")
        )

        val adaptador = RegalosAdapter(this, detallesRegalos)
        val gridViewRegalos = findViewById<GridView>(R.id.gridViewRegalos)
        gridViewRegalos.adapter = adaptador

        gridViewRegalos.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, DetalleRegalos::class.java)
            intent.putExtra("imagenResId", detallesRegalos[position].image)
            intent.putExtra("precio", detallesRegalos[position].precio)
            startActivity(intent)
        }
    }
}
