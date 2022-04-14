/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unidad_01_02;

/**
 *
 * @author HP
 */
public class PrincipalTelefonoPersona {
    public static void main(String[] args){
        var operadoraTel= new OperadoraTel();
        operadoraTel.codigo=1234;
        operadoraTel.descripcion="negado";
        operadoraTel.paginaWeb="www.pagina";
        var persona=new Persona();
        persona.nombre="Tefa";
        persona.cedula="0106384860";
        persona.fechaNacimiento=02-05-2000;
        var telefono=new Telefono();
        telefono.numero="4081657";
        telefono.tipo="Fijo";
        telefono.operadora=operadoraTel;
        telefono.propietario=persona;
        System.out.println("El telefono es: "+telefono.numero+"y pertenece a: "+persona.nombre+"su codigo de operadora es: "+operadoraTel.codigo);

       
    }
}
