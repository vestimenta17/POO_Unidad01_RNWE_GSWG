/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.unidad_01_02;

/**
 *
 * @author HP
 */
public class Unidad_01_02 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        var autoTefa= new Auto();
        autoTefa.color="amarillo";
        autoTefa.marca="KIA";
        autoTefa.placa="ADF1234";
        autoTefa.year=2022;
        autoTefa.precio=22500;
        
        System.out.println( autoTefa.color+" | "+
                            autoTefa.marca+" | "+
                            autoTefa.year+" | "+
                            autoTefa.placa+" | ");
        var esTaxi=false;
        esTaxi=autoTefa.esTaxi();
        if(esTaxi==true){
            System.out.println("El auto de placa : "+autoTefa.placa +" es un taxi");
        } else{
            System.out.println("El auto de placa : "+autoTefa.placa +" no es un taxi");
        }
        System.out.println("El auto de precio : "+autoTefa.precio +" Debe pagar la tasa solidaria "+autoTefa.calcularTasaSolidaria());
        var costoMatricula= autoTefa.calcularMatricula(2010, 10000);
        System.out.println("El valor de la matricula del auto es : "+costoMatricula+" dólares");
        System.out.println("Esta pertenece a la provincia: "+autoTefa.obtenerProvincia());

        
        var autoMarce= new Auto();
        autoMarce.color="negro";
        autoMarce.marca="KIA";
        autoMarce.placa="HBO2231";
        autoMarce.year=2009;
        autoMarce.precio=9845;
        
        System.out.println( autoMarce.color+" | "+
                            autoMarce.marca+" | "+
                            autoMarce.year+" | "+
                            autoMarce.placa+" | ");
        esTaxi=autoMarce.esTaxi();
        if(esTaxi==true){
                System.out.println("El auto de placa : "+autoMarce.placa +" es un taxi");
        } else{
            System.out.println("El auto de placa : "+autoMarce.placa +" no es un taxi");
        }
        System.out.println("El auto de precio : "+autoMarce.precio +" Debe pagar la tasa solidaria "+autoMarce.calcularTasaSolidaria());
        var costoMatricula2= autoMarce.calcularMatricula(2010, 10000);
        System.out.println("El valor de la matricula del auto es : "+costoMatricula2+" dólares");
        System.out.println("Esta pertenece a la provincia: "+autoMarce.obtenerProvincia());
        
        var animal1=new Animal();
        animal1.nombre="Perro";
        animal1.raza="Pekines";
        animal1.peso=3.1;
        animal1.añoNac=2020;
    }
}
