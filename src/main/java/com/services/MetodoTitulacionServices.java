/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.metodoTitulacion.MetodoTitulacionModel;
import com.mysqlconnection.ServiceConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adria
 */
public class MetodoTitulacionServices {

    ServiceConnection serviceConnection = new ServiceConnection();
    Statement stmt;

    public List<MetodoTitulacionModel> fetchMetodosTitulacion() {
        String query = "SELECT * FROM metodo_titulacion";

        List<MetodoTitulacionModel> carrerasList = new ArrayList<>();
        Connection con;
        try {
            con = DriverManager.getConnection(serviceConnection.getUrl(), serviceConnection.getUsuario(), serviceConnection.getPassword());
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                MetodoTitulacionModel mt = new MetodoTitulacionModel(rs.getInt("id"), rs.getString("libro"), rs.getString("descripcion"));
                carrerasList.add(mt);
            }
            stmt.close();
            con.close();

            return carrerasList;
        } catch (SQLException ex) {
            Logger.getLogger(MetodoTitulacionServices.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        }
    }
}
