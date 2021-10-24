package com.example.demo.practica01;

import java.util.ArrayList;
import java.util.Map;

public class Oliver {
    private static Oliver instance;

    private Map<String, Estudiante> estudiantes;
    private ArrayList<Libro> libros = new ArrayList<>(); //Ocurrence pattern

    private Oliver() {

    }

    public  LibroCopia registrarLibro(String name, String year, Autor autor, String edicion) {
        Libro libro = new Libro(name, year, autor);
        LibroCopia copia = new LibroCopia(libro, edicion);
        libro.agregarCopia(copia);
        libros.add(libro);
        return copia;
    }

    public ArrayList<Libro> buscarLibrosPorAuthor(Autor autor) {
        return new ArrayList<>();
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    //Singleton
    public static Oliver getInstance() {
        if (instance == null) {
            return new Oliver();
        }
        return instance;
    }
}
