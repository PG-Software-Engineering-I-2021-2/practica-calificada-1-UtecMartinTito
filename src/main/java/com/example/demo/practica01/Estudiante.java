package com.example.demo.practica01;

import java.util.logging.Logger;

public class Estudiante {

    private static Logger logger = Logger.getLogger(Estudiante.class.getName());
    private String name;
    private String email;
    private String celular;

    public void notificar(){
        logger.info("Se le notificara al estudiante por correo electronico.");
    }
}
