package com.company;

public class Container {

    private CodesForSymbols alphavite;
    private String binary;

    Container(String aStr){
        alphavite = new CodesForSymbols(aStr);
        binary = alphavite.encode(aStr);
    }

    public String getBinary() {
        return binary;
    }

    public CodesForSymbols getAlphavite() {
        return alphavite;
    }
}
