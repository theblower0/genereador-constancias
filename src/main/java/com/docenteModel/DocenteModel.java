/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docenteModel;

/**
 *
 * @author adria
 */
public class DocenteModel {
    
    private int id;

    
    private String grado;
    private String nombre;
    private String cedula;
    
    public DocenteModel(int id, String nombre, String grado, String cedula){
        this.id = id;
        this.grado = grado.toUpperCase();
        this.nombre = nombre.toUpperCase();
        this.cedula = cedula.toUpperCase();
    }
    
    public DocenteModel (String nombre, String grado, String cedula){
        this.nombre = nombre;
        this.grado = grado;
        this.cedula = cedula;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
     public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    
}
