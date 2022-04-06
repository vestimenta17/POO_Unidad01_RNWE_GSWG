/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unidad_01_02;

/**
 *
 * @author HP
 */
public class Auto {
    String placa;
    String marca;
    String color;
    double precio;
    int year;
    public boolean esTaxi(){
        var retorno=false;
        if(this.color=="amarillo"){
            retorno=true;
        }
        return retorno;
    }
    public int calcularTasaSolidaria(){
        var retorno=100000;
        if(this.precio>0 && this.precio<1000){
            retorno=0; 
        }else{
            if(this.precio>=1001 && this.precio<=10000){
                retorno=100;
            }
            else{
                if(this.precio>=10001 && this.precio<=25000){
                retorno=250;
            }else{
                    retorno=370;
                }
            }
        }
       
        return retorno;
    } 
    public String obtenerProvincia(){
        var retorno="sin provincia";
        
        
        
        return retorno;
        
    }
    public double calcularMatricula(){
        var retorno=20000d;
        if(this.precio>0 && this.precio<10000 && this.year>0 && this.year<2010){
            retorno=(this.precio*10)/100;
        }else{
            if(this.precio > 0 && this.precio < 10000 && this.year>2010){
                retorno=(this.precio*15)/100;
            }else{
                if(this.precio > 10000 && this.year>0 && this.year<2010){
                    retorno=(this.precio*20)/100;
                }else{
                    if(this.precio > 10000 && this.year>2010){
                        retorno=(this.precio*25)/100;
                    }
                }
            }
        }
        return retorno;
        
    }
  
}
    


        
