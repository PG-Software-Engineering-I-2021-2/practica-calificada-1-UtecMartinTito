package com.example.demo.practica01;

public class Tarifa {

    private final String desde;
    private final String hacia;

    public Tarifa(String desde, String hacia) {
        this.desde = desde;
        this.hacia = hacia;
    }

    public String getDesde() {
        return desde;
    }

    public String getHacia() {
        return hacia;
    }
}
