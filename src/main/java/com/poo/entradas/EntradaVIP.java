/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.entradas;

/**
 *
 * @author masdp
 */
public class EntradaVIP extends Entrada {
    private final double recargoVIP; 

    public EntradaVIP(String comprador, double precioBase, double recargoVIP) {
        super(comprador, precioBase);
        this.recargoVIP = recargoVIP;
    }

    @Override
    public double calcularPrecio() {
        return precioBase + recargoVIP;
    }
}