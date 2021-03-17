package br.com.danielamaral.fiapbandas.activity

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import br.com.danielamaral.fiapbandas.R
import br.com.danielamaral.fiapbandas.business.java.RegrasBusiness
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_avaliar.setOnClickListener() {
            avaliarBanda(et_nome_banda.text.toString())
        }
    }

    fun avaliarBanda(banda: String) {
        val avaliadorBandas = RegrasBusiness()
        val nota: Double = avaliadorBandas.getNotaBanda(banda)
        tv_nota.text = nota.toString()
        exibirEstrelas(nota.toInt())
    }

    fun exibirEstrelas(nota: Int) {
        ll_stars.removeAllViews()

        for (i in 1..nota) {
            val star: ImageView = ImageView(this)
            star.setBackgroundResource(R.drawable.star)
            val layoutParams = LinearLayout.LayoutParams(100, 100)
            star.setLayoutParams(layoutParams)
            ll_stars.addView(star)
        }
    }
}