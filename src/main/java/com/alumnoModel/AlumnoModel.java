/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alumnoModel;

import com.carreraModel.CarreraModel;

/**
 *
 * @author adria
 */
public class AlumnoModel {

    private String nombre;
    private String numeroControl;
    private CarreraModel carreraModel;

    public AlumnoModel(String nombre, String numeroControl, CarreraModel carreraModel) {
        this.nombre = nombre;
        this.numeroControl = numeroControl;
        this.carreraModel = carreraModel;
    }

    public CarreraModel getCarreraModel() {
        return carreraModel;
    }

    public void setCarreraModel(CarreraModel carreraModel) {
        this.carreraModel = carreraModel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }

}
