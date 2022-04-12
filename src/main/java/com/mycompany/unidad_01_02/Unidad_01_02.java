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
        autoTefa.year=2017;
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
        var añosCarro=autoTefa.calcularYears(2022);
        System.out.println("El carro tiene: "+añosCarro+" años");
        var seguroValido=false;
        seguroValido=autoTefa.seguroValido(2022, 4);
        if(seguroValido==true){
            System.out.println("El seguro de : "+autoTefa.placa +" es valido");
        } else{
            System.out.println("El seguro de :"+autoTefa.placa +" no es valido");
        }
        var esProvinciaDe=false;
        esProvinciaDe=autoTefa.esProvinciaDe("A");
        if(esProvinciaDe==true){
            System.out.println("Este carro pertenece a: "+esProvinciaDe);
        }else{
            System.out.println("No pertenece a ninguna provincia");
        }
        var esNumeros=true;
        if(esNumeros==false){
            esNumeros=autoTefa.esNumeros("Pertenece");
        } else{
            esNumeros=autoTefa.esNumeros("No Pertenece");  
        }
        

        
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
        var añosCarro2=autoMarce.calcularYears(2022);
        System.out.println("El carro tiene: "+añosCarro2+" años");
        var seguroValido2=false;
        seguroValido2=autoMarce.seguroValido(2022, 3);
        if(seguroValido2==true){
            System.out.println("El seguro de : "+autoMarce.placa +" es valido");
        } else{
            System.out.println("El seguro de :"+autoMarce.placa +" no es valido");
        }
        var esProvinciaDe1=false;
        esProvinciaDe1=autoMarce.esProvinciaDe("Azuay");
        if(esProvinciaDe==true){
            System.out.println("Este carro pertenece a: "+esProvinciaDe1);
        }else{
            System.out.println("No pertenece a ninguna provincia");
        }
        var animal1=new Animal();
        animal1.nombre="Perro";
        animal1.raza="Pekines";
        animal1.peso=3.1;
        animal1.añoNac=2020;
    }
}
