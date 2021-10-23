package com.example.demo.practica01;

import java.util.Map;
import java.util.HashMap;

public class SkyAlert {
    private static SkyAlert instance;

    private Map<Integer, Empresa> empresas = new HashMap<>();
    private Map<Integer, Usuario> usuarios = new HashMap<>();
    private Map<Integer, Tarifa> tarifas = new HashMap<>();

    private Map<Integer, HashMap<Integer, Integer>> tarifasEmpresas = new HashMap<>();
    private Map<Integer, HashMap<Integer, Boolean>> tarifasUsuarios = new HashMap<>();

    private SkyAlert(){

    }

    public void registrarEmpresa(Integer id, String nombre, Integer estrellas){
        empresas.put(id, new Empresa(nombre, estrellas));
    }

    public void registrarUsuario(Integer id, String nombre, String correo){
        usuarios.put(id, new Usuario(nombre, correo));
    }

    public void registrarTarifa(Integer id, String desde, String hacia){
        tarifas.put(id, new Tarifa(desde, hacia));
    }

    public boolean condicionMinima(){
        return usuarios.size() <= 4 || empresas.size() <= 2;
    }

    public boolean actualizarTarifaEmpresa(Integer idTarifa, Integer idEmpresa, Integer precio){
        if(condicionMinima()) return false;
        tarifasEmpresas.computeIfAbsent(idTarifa, k -> new HashMap<Integer, Integer>());
        tarifasEmpresas.get(idTarifa).put(idEmpresa, precio);
        var usuariosTarifa = tarifasUsuarios.get(idTarifa);
        for (Map.Entry<Integer, Boolean> entry : usuariosTarifa.entrySet()) {
            if(entry.getValue()) usuarios.get(entry.getKey()).notificar();
        }
        return true;
    }

    public boolean vincularUsuarioTarifa(Integer idUsuario, Integer idTarifa){
        if(condicionMinima()) return false;
        tarifasUsuarios.computeIfAbsent(idTarifa, k -> new HashMap<Integer, Boolean>());
        tarifasUsuarios.get(idTarifa).put(idUsuario, true);
        return true;
    }

    public boolean desvincularUsuarioTarifa(Integer idUsuario, Integer idTarifa){
        if(condicionMinima()) return false;
        tarifasUsuarios.get(idTarifa).put(idUsuario, false);
        return true;
    }

    public static SkyAlert getInstance() {
        if(instance == null){
            instance = new SkyAlert();
        }
        return instance;
    }
}
