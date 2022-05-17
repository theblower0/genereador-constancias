/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectoModel;

import com.metodoTitulacion.MetodoTitulacionModel;

/**
 *
 * @author adria
 */
public class ProyectoModel {
    
    private MetodoTitulacionModel metodoTitulacion;
    private String temaProyecto;
    
    public ProyectoModel(MetodoTitulacionModel metodoTitulacion, String temaProyecto){
        this.metodoTitulacion = metodoTitulacion;
        this.temaProyecto = temaProyecto;
    }
    
    
    public MetodoTitulacionModel getMetodoTitulacion() {
        return metodoTitulacion;
    }

    public void setMetodoTitulacion(MetodoTitulacionModel metodoTitulacion) {
        this.metodoTitulacion = metodoTitulacion;
    }

    public String getTemaProyecto() {
        return temaProyecto;
    }

    public void setTemaProyecto(String temaProyecto) {
        this.temaProyecto = temaProyecto;
    }


}
