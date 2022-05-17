/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.docenteModel.DocenteModel;
import com.mysqlconnection.ServiceConnection;
import com.utils.Utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adria
 */
public class DocenteServices {

    ServiceConnection serviceConnection = new ServiceConnection();
    Statement stmt;

    public Map<String, String> create(DocenteModel docente) {

        Utils utils = new Utils();

        if (serviceConnection.driverConnection() == null) {

            return utils.failureMessage();
        }

        String query = "INSERT INTO docentes (nombre,grado,cedula) VALUES ('" + docente.getNombre() + "','" + docente.getGrado() + "','" + docente.getCedula() + "')";
        Connection con;
        try {
            con = DriverManager.getConnection(serviceConnection.getUrl(), serviceConnection.getUsuario(), serviceConnection.getPassword());
            stmt = con.createStatement();
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);

            return utils.successMessage();
        } catch (SQLException ex) {
            Logger.getLogger(DocenteServices.class.getName()).log(Level.SEVERE, null, ex);
            return utils.failureMessage();

        }
    }

    public List<DocenteModel> getEvaluadores() {
        Utils utils = new Utils();

        String query = "SELECT * FROM docentes";
        List<DocenteModel> docenteList = new ArrayList<>();
        Connection con;
        try {
            con = DriverManager.getConnection(serviceConnection.getUrl(), serviceConnection.getUsuario(), serviceConnection.getPassword());
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            DocenteModel dm;
            while (rs.next()) {
                dm = new DocenteModel(rs.getInt("id"), rs.getString("nombre"), rs.getString("grado"), rs.getString("cedula"));
                docenteList.add(dm);
            }
            stmt.close();
            con.close();

            return docenteList;
        } catch (SQLException ex) {
            Logger.getLogger(DocenteServices.class.getName()).log(Level.SEVERE, null, ex);
            utils.failureMessage();
            return null;
        }

    }

    public void update() {

    }

    public void delete() {

    }

}
