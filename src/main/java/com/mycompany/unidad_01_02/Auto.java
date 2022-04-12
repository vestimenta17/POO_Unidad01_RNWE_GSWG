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
        var retorno="TBD";
        var primerCaracterPlaca=this.placa.charAt(0);
        switch(primerCaracterPlaca){
            case 'A':
                retorno="Azuay";
                break;
            case 'B':
                retorno="Bolivar";
                break;
            case 'C':
                retorno="Carchi";
                break;
            case 'U':
                retorno="Cañar";
                break;
            case 'X':
                retorno="Cotopaxi";
                break;
            case 'H':
                retorno="Chimborazo";
                break;
            case 'O':
                retorno="Oro";
                break;
            case 'E':
                retorno="Esmeraldas";
                break;
            case 'W':
                retorno="Galapagos";
                break;
            case 'G':
                retorno="Guayas";
                break;
            case 'I':
                retorno="Imbabura";
                break;
            case 'L':
                retorno="Loja";
                break;
            case 'R':
                retorno="Los Rios";
                break;
            case 'M':
                retorno="Manabi";
                break;
            case 'V':
                retorno="Morona Santiago";
                break;
            case 'N':
                retorno="Napo";
                break;
            case 'S':
                retorno="Pastaza";
                break;
            case 'P':
                retorno="Pichincha";
                break;
            case 'K':
                retorno="Sucumbios";
                break;
            case 'Q':
                retorno="Orellana";
                break;
            case 'T':
                retorno="Tunguragua";
                break;
            case 'Z':
                retorno="Zamora";
                break;
            case 'Y':
                retorno="Santa Elena";
                break;
        } 
        return retorno;   
    }
    public int calcularYears(int currentYear){
        var retorno=1000;
        retorno=(currentYear-this.year);
        return retorno;
    }
    public boolean seguroValido(int currentYear, int edadMax){
        var retorno=false;
        if(this.calcularYears(currentYear)<=edadMax){
            retorno=true;
        }
        return retorno;
    }
    public boolean esProvinciaDe(String provincia){
        var retorno=false;
        var primerLetraProvincia=this.placa.substring(0,1);
        var primerLetraPlaca=this.placa.substring(0,1);
        if(provincia=="Azuay" && primerLetraPlaca=="A"){
            retorno=true;
        }
        if(provincia=="Guayas" && primerLetraPlaca=="G"){
            retorno=true;
        }
        if(provincia=="Cañar" && primerLetraPlaca=="U"){
            retorno=true;
        }
        if(provincia=="Pichincha" && primerLetraPlaca=="P"){
            retorno=true;
        }     
        return retorno;
    }
    public boolean esNumeros(String cadena){
        boolean retorno=true;
        var i=0;
        var c=new char[4];
        while(i<4){
            c[i]=cadena.charAt(i);
            if(!Character.isDigit(c[i]));
            retorno=false;
            i=i+1;
        }
        return retorno;    
    }
    public double calcularMatricula(int limitYear, int limitPrecio){
        var retorno=10000d;
        if(this.year>=0 && this.year<=limitYear){
            if(this.precio>=0 && this.precio<=limitPrecio)
                retorno=this.precio*0.1;
            else
                retorno=this.precio*0.2;
        }else{
             if(this.precio>=0 && this.precio<=limitPrecio)
                retorno=this.precio*0.15;
            else
                retorno=this.precio*0.25;           
        }
        return retorno;
    }
    
}
    


        
