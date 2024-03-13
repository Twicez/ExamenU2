package mx.edu.potros.examenun2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import mx.edu.potros.examenun2.R

class RegalosAdapter(context: Context, private val detallesRegalos: List<Detalles>) :
    ArrayAdapter<Detalles>(context, R.layout.item_regalo, detallesRegalos) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var vista = convertView
        if (vista == null) {
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            vista = inflater.inflate(R.layout.item_regalo, null)
        }

        val imageView = vista!!.findViewById<ImageView>(R.id.imageViewRegalo)
        val textViewPrecio = vista.findViewById<TextView>(R.id.textViewPrecio)

        val detalles = detallesRegalos[position]
        imageView.setImageResource(detalles.image)
        textViewPrecio.text = "Precio: ${detalles.precio}"

        return vista
    }
}
