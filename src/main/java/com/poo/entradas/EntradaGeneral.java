/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.entradas;

/**
 *
 * @author masdp
 */
public class EntradaGeneral extends Entrada {
    private final String Zona; 

    public EntradaGeneral(String comprador, double precioBase, String zona) {
        super(comprador, precioBase);
        this.Zona = zona;
    }

    @Override
    public double calcularPrecio() {
        return precioBase; 
    }
}
