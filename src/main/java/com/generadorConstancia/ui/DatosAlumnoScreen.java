/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generadorConstancia.ui;

import com.docenteModel.DocenteModel;
import com.alumnoModel.AlumnoModel;
import com.carreraModel.CarreraModel;
import com.metodoTitulacion.MetodoTitulacionModel;
import com.proyectoModel.ProyectoModel;
import com.services.CarrerasServices;
import com.services.MetodoTitulacionServices;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author adria
 */
public class DatosAlumnoScreen extends javax.swing.JPanel {

    /**
     * Creates new form DatosAlumnoScreen
     */
    List<CarreraModel> carrerasList;
    List<MetodoTitulacionModel> metodosList;

    public DatosAlumnoScreen() {

        initComponents();
        fillComboCarreras();
        fillComboMetodoTitulacion();

    }

    public AlumnoModel getEstudiante() {

        String nombre = txtNombreEstudiante.getText().toUpperCase();
        String numControl = txtNumControl.getText();
        CarreraModel cm = carrerasList.get(comboCarreras.getSelectedIndex());

        AlumnoModel am = new AlumnoModel(nombre, numControl, cm);

        return am;
    }

    public String getNoControl() {
        String numControl = txtNumControl.getText();

        return numControl;
    }

    public ProyectoModel getProyecto() {
        MetodoTitulacionModel titulacion = metodosList.get(comboMetodoTitulacion.getSelectedIndex());
        String proyecto = txtProyecto.getText().toUpperCase();

        ProyectoModel pm = new ProyectoModel(titulacion, proyecto);

        return pm;
    }

    private void fillComboCarreras() {
        CarrerasServices cs = new CarrerasServices();
        carrerasList = cs.fetchCarreras();

        carrerasList.forEach((CarreraModel carrera) -> {
            comboCarreras.addItem(carrera.getNombre());
        });

    }

    private void fillComboMetodoTitulacion() {
        MetodoTitulacionServices mt = new MetodoTitulacionServices();
        metodosList = mt.fetchMetodosTitulacion();

        metodosList.forEach((MetodoTitulacionModel mm) -> {
            comboMetodoTitulacion.addItem(mm.getDescripcion());
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreEstudiante = new javax.swing.JTextField();
        txtNumControl = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtProyecto = new javax.swing.JTextArea();
        comboCarreras = new javax.swing.JComboBox<>();
        comboMetodoTitulacion = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setMaximumSize(new java.awt.Dimension(750, 400));
        setMinimumSize(new java.awt.Dimension(750, 400));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(750, 400));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Datos del alumno");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Número de control");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Carrera");

        txtNombreEstudiante.setMaximumSize(new java.awt.Dimension(280, 30));
        txtNombreEstudiante.setMinimumSize(new java.awt.Dimension(280, 30));
        txtNombreEstudiante.setPreferredSize(new java.awt.Dimension(280, 30));

        txtNumControl.setMaximumSize(new java.awt.Dimension(280, 30));
        txtNumControl.setMinimumSize(new java.awt.Dimension(280, 30));
        txtNumControl.setPreferredSize(new java.awt.Dimension(280, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Titulación");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Tema de Proyecto");

        txtProyecto.setColumns(20);
        txtProyecto.setLineWrap(true);
        txtProyecto.setRows(5);
        jScrollPane1.setViewportView(txtProyecto);

        comboCarreras.setMaximumSize(new java.awt.Dimension(280, 30));
        comboCarreras.setMinimumSize(new java.awt.Dimension(280, 30));
        comboCarreras.setPreferredSize(new java.awt.Dimension(280, 30));

        comboMetodoTitulacion.setMaximumSize(new java.awt.Dimension(280, 30));
        comboMetodoTitulacion.setMinimumSize(new java.awt.Dimension(280, 30));
        comboMetodoTitulacion.setPreferredSize(new java.awt.Dimension(280, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombreEstudiante, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNumControl, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addComponent(comboCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboMetodoTitulacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(224, 224, 224)))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboMetodoTitulacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(comboCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboCarreras;
    private javax.swing.JComboBox<String> comboMetodoTitulacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNombreEstudiante;
    private javax.swing.JTextField txtNumControl;
    private javax.swing.JTextArea txtProyecto;
    // End of variables declaration//GEN-END:variables
}
