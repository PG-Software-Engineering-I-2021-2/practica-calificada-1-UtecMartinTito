package com.example.demo.practica01;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private final String nombre;
    private final Integer estrellas;

    public Empresa(String nombre, Integer estrellas) {
        this.nombre = nombre;
        this.estrellas = estrellas;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEstrellas() {
        return estrellas;
    }
}
