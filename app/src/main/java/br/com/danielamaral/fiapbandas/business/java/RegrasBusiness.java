package br.com.danielamaral.fiapbandas.business.java;

public class RegrasBusiness {

    public double getNotaBanda(String banda) throws Exception {
        if (banda.toLowerCase().equals("metallica")) {
            return 10.0;
        } else if (banda.toLowerCase().equals("bad religion")) {
            return 9.0;
        } else if (banda.toLowerCase().equals("callipso")) {
            return 2.5;
        } else {
            return 0.0;
        }
    }
}



