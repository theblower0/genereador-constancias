/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generadorConstancia.ui;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author adria
 */
public class FechaTitulacionScreen extends javax.swing.JPanel {

    /**
     * Creates new form FechaTitulacionScreen
     */
    int indexOption;

    public FechaTitulacionScreen(int index) {
        this.indexOption = index;
        initComponents();
        tesis();

    }

    public void setIndexOption(int indexOption) {
        this.indexOption = indexOption;
    }

    private void tesis() {

        if (indexOption == 1) {
            horaInicio.setVisible(false);
            horaTermino.setVisible(false);
            labelHoraInicio.setVisible(false);
            labelHoraTermino.setVisible(false);
        } else {
            horaInicio.setVisible(true);
            horaTermino.setVisible(true);
            labelHoraInicio.setVisible(true);
            labelHoraTermino.setVisible(true);
        }
    }

    public String getFechaAutorizacion() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMMM/yyyy");
        String stringDate = dateFormat.format(fechaAutorizacion.getDate());

        return stringDate;

    }

    public String getFechaExpedicion() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMMM/yyyy");
        String stringDate = dateFormat.format(fechaExpedicion.getDate());

        return stringDate;

    }

    public String getFoja() {

        return this.numFoja.getValue().toString();

    }

    public String getHoraInicio() {

        if (!horaInicio.isVisible()) {
            return "";
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = (Date) horaInicio.getValue();

        String stringDate = dateFormat.format(date);

        return stringDate;
    }

    public String getHoraTermino() {
        
        if (!horaTermino.isVisible()) {
            return "";
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = (Date) horaTermino.getValue();

        String stringDate = dateFormat.format(date);

        return stringDate;
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
        jLabel8 = new javax.swing.JLabel();
        numFoja = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        fechaExpedicion = new com.toedter.calendar.JDateChooser();
        fechaAutorizacion = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        labelHoraInicio = new javax.swing.JLabel();
        Date date = new Date();
        SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        horaInicio = new javax.swing.JSpinner(sm);
        labelHoraTermino = new javax.swing.JLabel();
        Date date2 = new Date();
        SpinnerDateModel sm2 = new SpinnerDateModel(date2, null, null, Calendar.HOUR_OF_DAY);
        horaTermino = new javax.swing.JSpinner(sm2);

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(750, 400));
        setMinimumSize(new java.awt.Dimension(750, 400));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Datos del Documento");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Numero de Foja");

        numFoja.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numFoja.setMaximumSize(new java.awt.Dimension(80, 30));
        numFoja.setMinimumSize(new java.awt.Dimension(80, 30));
        numFoja.setPreferredSize(new java.awt.Dimension(80, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Fecha Expedicion");

        fechaExpedicion.setDateFormatString("d MMMM y");
        fechaExpedicion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        fechaAutorizacion.setDateFormatString("d MMMM y");
        fechaAutorizacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Fecha Autorización");

        labelHoraInicio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelHoraInicio.setText("Hora Inicio");

        JSpinner.DateEditor de = new JSpinner.DateEditor(horaInicio, "HH:mm");
        horaInicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        horaInicio.setEditor(de);
        horaInicio.setMaximumSize(new java.awt.Dimension(150, 30));
        horaInicio.setMinimumSize(new java.awt.Dimension(150, 30));
        horaInicio.setPreferredSize(new java.awt.Dimension(150, 30));

        labelHoraTermino.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelHoraTermino.setText("Hora Termino");

        JSpinner.DateEditor de2 = new JSpinner.DateEditor(horaTermino, "HH:mm");
        horaTermino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        horaTermino.setEditor(de2);
        horaTermino.setMaximumSize(new java.awt.Dimension(150, 30));
        horaTermino.setMinimumSize(new java.awt.Dimension(150, 30));
        horaTermino.setPreferredSize(new java.awt.Dimension(150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(236, 236, 236))
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaExpedicion, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(numFoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(horaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelHoraInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelHoraTermino)
                    .addComponent(horaTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaAutorizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numFoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaExpedicion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaAutorizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelHoraInicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(horaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelHoraTermino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(horaTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fechaAutorizacion;
    private com.toedter.calendar.JDateChooser fechaExpedicion;
    private javax.swing.JSpinner horaInicio;
    private javax.swing.JSpinner horaTermino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelHoraInicio;
    private javax.swing.JLabel labelHoraTermino;
    private javax.swing.JSpinner numFoja;
    // End of variables declaration//GEN-END:variables
}