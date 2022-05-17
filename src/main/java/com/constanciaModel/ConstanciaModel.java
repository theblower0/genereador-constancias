/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.constanciaModel;

import com.docenteModel.DocenteModel;
import com.alumnoModel.AlumnoModel;
import com.proyectoModel.ProyectoModel;
import java.util.List;

/**
 *
 * @author adria
 */
public class ConstanciaModel {

    private AlumnoModel alumno;
    private List<DocenteModel> evaluadoresList;
    private ProyectoModel proyecto;

    private String foja;
    private String fechaAutorizacion;
    private String fechaExpedicion;
    private String horaInicio = "";
    private String horaTermino = "";

    public ConstanciaModel(AlumnoModel estudiante, List<DocenteModel> evaluadoresList, ProyectoModel proyecto, String fechaAutorizacion,
            String fechaExpedicion, String foja, String horaInicio, String horaTermino) {

        this.alumno = estudiante;
        this.evaluadoresList = evaluadoresList;
        this.proyecto = proyecto;

        this.fechaAutorizacion = fechaAutorizacion;
        this.fechaExpedicion = fechaExpedicion;
        this.foja = foja;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
    }

    public ConstanciaModel(AlumnoModel estudiante, List<DocenteModel> evaluadoresList, ProyectoModel proyecto, String fechaAutorizacion,
            String fechaExpedicion, String foja) {

        this.alumno = estudiante;
        this.evaluadoresList = evaluadoresList;
        this.proyecto = proyecto;

        this.fechaAutorizacion = fechaAutorizacion;
        this.fechaExpedicion = fechaExpedicion;
        this.foja = foja;
    }

    public AlumnoModel getAlumno() {
        return alumno;
    }

    public void setAlumno(AlumnoModel alumno) {
        this.alumno = alumno;
    }

    public List<DocenteModel> getEvaluadoresList() {
        return evaluadoresList;
    }

    public void setEvaluadoresList(List<DocenteModel> evaluadoresList) {
        this.evaluadoresList = evaluadoresList;
    }

    public ProyectoModel getProyecto() {
        return proyecto;
    }

    public void setProyecto(ProyectoModel proyecto) {
        this.proyecto = proyecto;
    }

    public String getFoja() {
        return foja;
    }

    public void setFoja(String foja) {
        this.foja = foja;
    }

    public String getFechaAutorizacion() {
        return fechaAutorizacion;
    }

    public void setFechaAutorizacion(String fechaAutorizacion) {
        this.fechaAutorizacion = fechaAutorizacion;
    }

    public String getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(String fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraTermino() {
        return horaTermino;
    }

    public void setHoraTermino(String horaTermino) {
        this.horaTermino = horaTermino;
    }

}
