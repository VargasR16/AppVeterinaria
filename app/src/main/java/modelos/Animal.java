/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author fl1pc07
 */
public abstract class Animal {
    protected String nombre;
    protected LocalDate fechaVacuna;
    protected LocalDate fechaProximaVacuna;
    protected String sexo;
    protected String raza;
    protected double peso;
    protected int edad;

    public Animal(String nombre, LocalDate fechaVacuna, LocalDate fechaProximaVacuna, String sexo, String raza, double peso, int edad) {
        this.nombre = nombre;
        this.fechaVacuna = fechaVacuna;
        this.fechaProximaVacuna = fechaProximaVacuna;
        this.sexo = sexo;
        this.raza = raza;
        this.peso = peso;
        this.edad = edad;
    }

    public abstract LocalDate getProximaFechaDeVacuna();
//    public void mostrarInformacionVacuna() {
//        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        System.out.println("Nombre: " + nombre);
//        System.out.println("Primera vacuna: " + fechaVacuna.format(formato));
//        System.out.println("Próxima vacuna: " + getProximaFechaDeVacuna().format(formato));
//        System.out.println("Sexo de la mascota: " + sexo);
//        System.out.println("Raza de la mascota: " + raza);
//        System.out.println("Peso de la mascota: " + peso + " kg");
//        System.out.println("Edad de la mascota: " + edad + " años");

    }

 
