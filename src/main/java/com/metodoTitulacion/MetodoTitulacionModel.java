/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metodoTitulacion;

/**
 *
 * @author adria
 */
public class MetodoTitulacionModel {
    
    int id;
    String libro;
    String descripcion;

    public MetodoTitulacionModel(int id, String libro, String descripcion) {
        this.id = id;
        this.libro = libro;
        this.descripcion = descripcion;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
