/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unidad_01_02;

/**
 *
 * @author HP
 */
public class PrincipalAutoPropietario {
    public static void main(String[] args){
        var auto=new Auto();
        auto.color="plata";
        auto.marca="Chevrolet";
        auto.precio=13000;
        auto.placa="ABG1345";
        auto.year=2016;
        var propietario=new Propietario();
        propietario.nombre="Pedro";
        propietario.direccion="Los cerezos";
        propietario.telefono="096471823";
    
        System.out.println("El dueño del auto de placa: "+auto.placa+"es "+auto.unPropietario.nombre);
        
    }
}
