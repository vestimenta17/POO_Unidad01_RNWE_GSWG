/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unidad_01_02;

/**
 *
 * @author HP
 */
public class Arreglo {
    public int[] crearVector(int f){
        var retorno =new int[f];
        for(var i=0;i<retorno.length;i++){
            var aleatorio=Math.random();
            if (aleatorio>=0 && aleatorio<0.1)
                retorno[i]=0;
            if (aleatorio>=0 && aleatorio<0.2)
                retorno[i]=1;
            if (aleatorio>=0 && aleatorio<0.3)
                retorno[i]=2;
            if (aleatorio>=0 && aleatorio<0.4)
                retorno[i]=3;
            if (aleatorio>=0 && aleatorio<0.5)
                retorno[i]=4;
            if (aleatorio>=0 && aleatorio<0.6)
                retorno[i]=5;
            if (aleatorio>=0 && aleatorio<0.7)
                retorno[i]=6;
            if (aleatorio>=0 && aleatorio<0.8)
                retorno[i]=7;
            if (aleatorio>=0 && aleatorio<0.9)
                retorno[i]=8;
            if (aleatorio>=0 && aleatorio<1.0)
                retorno[i]=9;    
        }
      
    return retorno; 
    }
}
