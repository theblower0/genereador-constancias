/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generadorConstancia;

import com.constanciaModel.ConstanciaModel;
import com.docenteModel.DocenteModel;
import com.alumnoModel.AlumnoModel;
import com.carreraModel.CarreraModel;
import com.constanciaModel.dateGenerator.DateGenerator;
import com.proyectoModel.ProyectoModel;
import com.spire.doc.Document;
import com.spire.doc.FileFormat;
import java.awt.Desktop;
import java.io.File;
import java.util.List;
import javax.swing.JFileChooser;

/**
 *
 * @author adria
 */
public class GeneradorConstancia {

    private final String templateTitulacion = "./templates/templateTitulacionIntegral.docx";
    private final String templateTesis = "./templates/templateTesis.docx";
    DateGenerator dg = new DateGenerator();

    public void generarConstanciaTitulacion(ConstanciaModel constanciaModel) {

        String ruta = "";

        AlumnoModel estudiante = constanciaModel.getAlumno();
        CarreraModel carrera = estudiante.getCarreraModel();
        ProyectoModel proyecto = constanciaModel.getProyecto();
        List<DocenteModel> evaluadoresList = constanciaModel.getEvaluadoresList();

        JFileChooser chooser = new JFileChooser();
        chooser.setSelectedFile(new File(estudiante.getNumeroControl()));
        if (chooser.showSaveDialog(chooser) == JFileChooser.APPROVE_OPTION) {

            ruta = chooser.getSelectedFile().getAbsolutePath();
        }

        Document document = new Document();
        document.loadFromFile(templateTitulacion);

        document.replace("nombreAlumno", estudiante.getNombre(), true, true);
        document.replace("numControl", estudiante.getNumeroControl(), true, true);
        document.replace("metodoTitulacion", proyecto.getMetodoTitulacion().getDescripcion(), true, true);
        document.replace("temaProyecto", proyecto.getTemaProyecto(), true, true);
        document.replace("carreraAlumno", carrera.getNombre(), true, true);

        for (int i = 0; i < evaluadoresList.size(); i++) {

            document.replace("Grado" + i, evaluadoresList.get(i).getGrado(), true, true);
            document.replace("Docente" + i, evaluadoresList.get(i).getNombre(), true, true);
            document.replace("Cedula" + i, evaluadoresList.get(i).getCedula(), true, true);

        }
        document.replace("numeroFoja", constanciaModel.getFoja(), true, true);
        document.replace("fechaAutorizacion", dg.getFechaNormalLetra(constanciaModel.getFechaAutorizacion()), true, true);
        document.replace("fechaExpedicion", dg.getFechaNormalLetra(constanciaModel.getFechaExpedicion()), true, true);

        document.saveToFile(ruta + ".docx", FileFormat.Docx);

        File newFile = new File(ruta + ".docx");

        try {
            Desktop.getDesktop().open(newFile);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void generarConstanciaTesis(ConstanciaModel constanciaModel) {

        String ruta = "";

        AlumnoModel estudiante = constanciaModel.getAlumno();
        CarreraModel carrera = estudiante.getCarreraModel();
        ProyectoModel proyecto = constanciaModel.getProyecto();
        List<DocenteModel> evaluadoresList = constanciaModel.getEvaluadoresList();

        JFileChooser chooser = new JFileChooser();
        chooser.setSelectedFile(new File(estudiante.getNumeroControl()));
        if (chooser.showSaveDialog(chooser) == JFileChooser.APPROVE_OPTION) {

            ruta = chooser.getSelectedFile().getAbsolutePath();
        }

        Document document = new Document();
        document.loadFromFile(templateTesis);

        document.replace("nombreAlumno", estudiante.getNombre(), true, true);
        document.replace("numControl", estudiante.getNumeroControl(), true, true);
        document.replace("metodoTitulacion", proyecto.getMetodoTitulacion().getDescripcion(), true, true);
        document.replace("temaProyecto", proyecto.getTemaProyecto(), true, true);
        document.replace("carreraAlumno", carrera.getNombre(), true, true);

        for (int i = 0; i < evaluadoresList.size(); i++) {

            document.replace("Grado" + i, evaluadoresList.get(i).getGrado(), true, true);
            document.replace("Docente" + i, evaluadoresList.get(i).getNombre(), true, true);
            document.replace("Cedula" + i, evaluadoresList.get(i).getCedula(), true, true);

        }
        document.replace("horaInicio", constanciaModel.getHoraInicio(), true, true);
        document.replace("horaTermino", constanciaModel.getHoraTermino(), true, true);
        document.replace("numeroFoja", constanciaModel.getFoja(), true, true);
        document.replace("fechaAutorizacion", dg.getFechaNormalLetra(constanciaModel.getFechaAutorizacion()), true, true);
        document.replace("fechaExpedicion", dg.getFechaEspecialLetra(constanciaModel.getFechaExpedicion()), true, true);

        document.saveToFile(ruta + ".docx", FileFormat.Docx);

        File newFile = new File(ruta + ".docx");

        try {
            Desktop.getDesktop().open(newFile);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
