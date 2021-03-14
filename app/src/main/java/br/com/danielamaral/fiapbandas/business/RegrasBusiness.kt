package br.com.danielamaral.fiapbandas.business

class RegrasBusiness {

    fun getNotaBanda(nomeBanda: String): Double {
        var notaBanda: Double = 0.0;

        if (nomeBanda.toLowerCase() == "metallica") {
            notaBanda = 10.0
        } else if (nomeBanda.toLowerCase() == "bad religion") {
            notaBanda = 9.0
        } else if (nomeBanda.toLowerCase() == "callipso") {
            notaBanda = 2.0
        }

        return notaBanda;
    }
}