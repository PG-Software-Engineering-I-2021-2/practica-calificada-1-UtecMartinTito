package com.example.demo.practica01;

import java.util.ArrayList;

public class Libro {
    private String name;
    private String year;
    private Autor author;
    private ArrayList<LibroCopia> copias = new ArrayList<>();

    public Libro(String name, String year, Autor author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public void agregarCopia(LibroCopia copia) {
        copias.add(copia);
    }
}
