package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recycler.adapter = SitiosAdapter(
            listOf(
                Sitio("Jardin Botanico", "jardinb", "El Jardín Botánico de Bogotá, nombrado oficialmente Jardín Botánico José Celestino Mutis en honor al astrónomo y botánico José Celestino Mutis, es un centro de investigación, conservación y divulgación de la diversidad de las especies vegetales en Bogotá, capital de Colombia. Fundado en 1955 por el sacerdote Enrique Pérez Arbeláez.\n" +
                        "\n"),
                Sitio("Museo Nacional", "museo_nal", "El Museo Nacional de Colombia, comúnmente abreviado como Museo Nacional o MNC, es el primer museo fundado en la República de Colombia. Cuenta con su sede en la capital, Bogotá.\n" +
                        "\n"),
                Sitio("Museo del Oro", "museo_oro", "El Museo del Oro del Banco de la República de Colombia es una institución pública la cual su fin es la adquisición, conservación y exposición de piezas de orfebrería y alfarería de culturas indígenas del periodo precolombino de la actual Colombia, cuenta con más de 30 000 piezas hechas en oro, 20 000 de objetos líticos, cerámicos, piedras y textiles pertenecientes a las culturas Quimbaya, Calima, Tairona, Zenú, Muisca, Tolima, Tumaco entre otros.\n" +
                        "\n"),
                Sitio("Plaza Bolivar", "plazabolivar", "La Plaza de Bolívar ha sido el centro de la historia del país. Fue mercado público y circo de toros, entre otras cosas, y ahí aún se llevan a cabo una variedad amplia de eventos culturales y sociales. Este espacio público, que en Navidad se adorna con miles de luces de colores, está enmarcado por edificios como el Palacio Liévano, el Capitolio Nacional y la Catedral Primada.\n" +
                        "\n"),
            )
        )
    }
}