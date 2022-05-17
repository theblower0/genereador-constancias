/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.constanciaModel.ConstanciaModel;
import com.docenteModel.DocenteModel;
import com.alumnoModel.AlumnoModel;
import com.mysqlconnection.ServiceConnection;
import com.proyectoModel.ProyectoModel;
import com.utils.Utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adria
 */
public class ConstanciaServices {

    ServiceConnection serviceConnection = new ServiceConnection();
    Statement stmt;
    Utils utils = new Utils();

    private int createProyecto(ProyectoModel proyecto) {

        if (serviceConnection.driverConnection() == null) {
            return 0;
        }

        String query = "INSERT INTO proyectos (nombre,metodo_titulacion_id) "
                + "VALUES ('" + proyecto.getTemaProyecto() + "','" + proyecto.getMetodoTitulacion().getId() + "')";

        try {
            Connection con = DriverManager.getConnection(serviceConnection.getUrl(), serviceConnection.getUsuario(), serviceConnection.getPassword());
            stmt = con.createStatement();
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);

            return fetchIndex(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(ConstanciaServices.class.getName()).log(Level.SEVERE, null, ex);

            return 0;
        }

    }

    private int createAlumno(AlumnoModel alumno, int proyectoIndex) {
        if (serviceConnection.driverConnection() == null) {
            return 0;
        }
        String query = "INSERT INTO alumnos (nombre,no_control,carrera, proyectos_id) "
                + "VALUES ('" + alumno.getNombre() + "','" + alumno.getNumeroControl()
                + "','" + alumno.getCarreraModel().getId() + "','" + proyectoIndex + "')";
        try {
            Connection con = DriverManager.getConnection(serviceConnection.getUrl(), serviceConnection.getUsuario(), serviceConnection.getPassword());
            stmt = con.createStatement();
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);

            return fetchIndex(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(ConstanciaServices.class.getName()).log(Level.SEVERE, null, ex);

            return 0;
        }
    }

    private int createEvaluadores(List<DocenteModel> evaluadores) {

        if (serviceConnection.driverConnection() == null) {

            return 0;
        }

        String query = "INSERT INTO evaluadores (presidente,secretario,vocal) "
                + "VALUES ('" + evaluadores.get(0).getId() + "','" + evaluadores.get(1).getId()
                + "','" + evaluadores.get(2).getId() + "')";
        try {
            Connection con = DriverManager.getConnection(serviceConnection.getUrl(), serviceConnection.getUsuario(), serviceConnection.getPassword());
            stmt = con.createStatement();
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);

            return fetchIndex(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(ConstanciaServices.class.getName()).log(Level.SEVERE, null, ex);

            return 0;
        }

    }

    public Map<String, String> createConstancia(ConstanciaModel constancia) {

        int alumnoIndex = 0;
        int evaluadoresIndex = 0;

        int proyectoIndex = createProyecto(constancia.getProyecto());

        if (proyectoIndex != 0) {
            alumnoIndex = createAlumno(constancia.getAlumno(), proyectoIndex);
        }
        if (alumnoIndex != 0) {
            evaluadoresIndex = createEvaluadores(constancia.getEvaluadoresList());
        }

        if (evaluadoresIndex != 0) {
            if (serviceConnection.driverConnection() == null) {

                return utils.failureMessage();
            }
            String query = "INSERT INTO constancia (hora_inicio,hora_termino,fecha_autorizacion, fecha_expedicion, num_foja, evaluadores_id, alumnos_id) "
                    + "VALUES ('" + constancia.getHoraInicio() + "','" + constancia.getHoraTermino() + "','" + constancia.getFechaAutorizacion() + "','" + constancia.getFechaExpedicion()
                    + "','" + constancia.getFoja() + "','" + evaluadoresIndex + "','" + alumnoIndex + "')";

            try {
                Connection con = DriverManager.getConnection(serviceConnection.getUrl(), serviceConnection.getUsuario(), serviceConnection.getPassword());
                stmt = con.createStatement();
                stmt.executeUpdate(query);

                return utils.succesSaveAlumno();
            } catch (SQLException ex) {
                Logger.getLogger(ConstanciaServices.class.getName()).log(Level.SEVERE, null, ex);

                return utils.failureMessage();
            }
        } else {
            return utils.failureMessage();
        }

    }

    public boolean isCreated(String noControl) {

        //NOTE: COMPROBAR SI EL USUARIO YA ESTÁ REGISTRADO
        String query = "SELECT EXISTS(SELECT * FROM alumnos where no_control='" + noControl + "')";
        boolean exists = false;

        try {
            Connection con = DriverManager.getConnection(serviceConnection.getUrl(), serviceConnection.getUsuario(), serviceConnection.getPassword());
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                exists = rs.getBoolean(1);

            }
            stmt.close();
            con.close();

            return exists;
        } catch (SQLException ex) {
            Logger.getLogger(ConstanciaServices.class.getName()).log(Level.SEVERE, null, ex);

            return false;
        }

    }

    private int fetchIndex(Statement stmt) {

        int generatedKey = 0;
        try {
            ResultSet rs = stmt.getGeneratedKeys();

            if (rs.next()) {
                generatedKey = rs.getInt(1);
            }
            return generatedKey;
        } catch (SQLException ex) {
            Logger.getLogger(ConstanciaServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Proyecto index: " + generatedKey);

        return 0;
    }

}
