/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.entradas;

/**
 *
 * @author masdp
 */
public abstract class Entrada {
    protected String comprador;
    protected double precioBase;

    public Entrada(String comprador, double precioBase) {
        this.comprador = comprador;
        this.precioBase = precioBase;
    }

    public abstract double calcularPrecio();

    public double calcularPrecio(int cantidad) {
        return calcularPrecio() * cantidad;
    }

    public static String nombreEvento() {
        return "Concierto Wakanda passa passa";
    }
}