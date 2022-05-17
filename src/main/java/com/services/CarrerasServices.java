/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.carreraModel.CarreraModel;
import com.docenteModel.DocenteModel;
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
public class CarrerasServices {

    ServiceConnection serviceConnection = new ServiceConnection();
    Statement stmt;

    public List<CarreraModel> fetchCarreras() {

        String query = "SELECT * FROM carreras";
        List<CarreraModel> carrerasList = new ArrayList<>();
        Connection con;
        try {
            con = DriverManager.getConnection(serviceConnection.getUrl(), serviceConnection.getUsuario(), serviceConnection.getPassword());
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                CarreraModel cm = new CarreraModel(rs.getInt("id"), rs.getString("nombre"));
                carrerasList.add(cm);
            }
            stmt.close();
            con.close();

            return carrerasList;
        } catch (SQLException ex) {
            Logger.getLogger(CarrerasServices.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
}
