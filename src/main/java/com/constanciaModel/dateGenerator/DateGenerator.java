/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.constanciaModel.dateGenerator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author adria
 */
public class DateGenerator {
    
    private String fechaLetra;
    
    //29 del mes de ABRIL del año 2021
    //05/mayo/2022
    
    
    public String getFechaNormalLetra(String fecha){
        
        String[] elems = fecha.split("/");
        
        String fechaLetra = elems[0]+" del mes de "+elems[1].toUpperCase()+" del año "+elems[2];
        
        return fechaLetra;
        
    }
    
    public String getFechaEspecialLetra(String fecha){
        
        String[] elems = fecha.split("/");
        
        String fechaLetra = elems[0]+" días del mes de "+elems[1].toUpperCase()+" del año "+elems[2];
        
        return fechaLetra;
        
    }
    
   
    
    
    private String generarMes(){
        DateConstants mes = new DateConstants();
        
        
        LocalDate fecha = LocalDate.now();        
        DateTimeFormatter formatoMes = DateTimeFormatter.ofPattern("MM");       
        
        String mesNum = fecha.format(formatoMes);
        
        int currentMonth = Integer.parseInt(mesNum);
             
        return mes.getMonth(currentMonth); 
    }
   
    
    private String generarDia(){
        
        LocalDate fecha = LocalDate.now();        
        DateTimeFormatter formatoDia = DateTimeFormatter.ofPattern("MM");        
        String diaNum = fecha.format(formatoDia);
        
        return diaNum;
    }
    //TODO: MODIFICAR PARA SOLO CAPTAR LA FECHA DADA
    public String generarFecha(){
        return null;
    }
    
}
