package br.com.danielamaral.fiapbandas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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
        val avaliadorBandas = RegrasBusiness();
        println(avaliadorBandas.getNotaBanda(banda))

        tv_nota.text = avaliadorBandas.getNotaBanda(banda).toString();
    }
}