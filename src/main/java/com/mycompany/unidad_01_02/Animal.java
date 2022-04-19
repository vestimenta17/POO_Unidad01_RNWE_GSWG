/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unidad_01_02;
import java.time.LocalDate;
/**
 *
 * @author HP
 */
public class Animal {
    private String nombre;
    private int yearNacimiento;
    private String raza;
    private String color;
  public int calcularEdad(){
        return LocalDate.now().getYear()-this.yearNacimiento;
    }
    
    
    
    //Getters & Setters
    
    public int getYearNacimiento(){
        return this.yearNacimiento;
    }
    
    public void setYearNacimiento(int y){
        this.yearNacimiento=y;
    }
}
