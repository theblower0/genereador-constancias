/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utils;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author adria
 */
public class Utils {

    public Map<String, String> successMessage() {

        Map<String, String> map = new HashMap();

        map.put("mensaje", "Evaluador creado correctamente");
        map.put("status", "200");

        return map;
    }
    
    public Map<String, String> succesSaveAlumno() {

        Map<String, String> map = new HashMap();

        map.put("mensaje", "Datos guardados correctamente");
        map.put("status", "200");

        return map;
    }
    

    public Map<String, String> failureMessage() {
        Map<String, String> map = new HashMap();
        
        map.put("mensaje", "Hubo un fallo, intenta de nuevo");
        map.put("status", "500");
        
        return map;
    }
    
    

}
