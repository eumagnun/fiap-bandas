package br.com.danielamaral.fiapbandas.business

class RegrasBusiness {

    fun getNotaBanda(nomeBanda: String): Double {
        val notaBanda: Double;

        if (nomeBanda.toLowerCase() == "metallica") {
            notaBanda = 10.0
        } else if (nomeBanda.toLowerCase() == "bad religion") {
            notaBanda = 9.0
        } else if (nomeBanda.toLowerCase() == "callipso") {
            notaBanda = 2.0
        }

        return 0.0;
    }
}