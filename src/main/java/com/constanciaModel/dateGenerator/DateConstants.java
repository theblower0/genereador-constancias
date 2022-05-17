/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.constanciaModel.dateGenerator;

/**
 *
 * @author adria
 */
public class DateConstants {
    
    private String[] meses;
    
    public DateConstants(){
       meses =new String[]{"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    }
    
    public String getMonth(int index){
        String mesBuscado = this.meses[index-1];
        return mesBuscado.toUpperCase();
    }
}
