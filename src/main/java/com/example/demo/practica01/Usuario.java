package com.example.demo.practica01;
import java.util.logging.Logger;

public class Usuario {
    private static Logger logger = Logger.getLogger(Usuario.class.getName());

    private final String nombre;
    private final String correo;

    public Usuario(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void notificar(){
        logger.info("Se le notificÃ³ al usuario xxxx por correo...");
    }
}
