/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poo.entradas;

/**
 *
 * @author masdp
 */
import java.util.Scanner;

public class Entradas {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nombre del comprador general: ");
            String nombre1 = sc.nextLine();
            System.out.print("Precio base: ");
            double base = sc.nextDouble();
            sc.nextLine();
            System.out.print("Zona: ");
            String zona = sc.nextLine();
            
            System.out.print("Nombre del comprador VIP: ");
            String nombre2 = sc.nextLine();
            System.out.print("Recargo VIP: ");
            double recargo = sc.nextDouble();
            
            Entrada a = new EntradaGeneral(nombre1, base, zona);
            Entrada b = new EntradaVIP(nombre2, base, recargo);
            
            System.out.println("\n--- Ligadura estática ---");
            System.out.println("Evento: " + Entrada.nombreEvento());
            
            System.out.println("\n--- Ligadura dinámica (sobrescritura + polimorfismo) ---");
            System.out.println("General: " + a.calcularPrecio());
            System.out.println("VIP: " + b.calcularPrecio());
            
            System.out.println("\n--- Sobrecarga ---");
            System.out.println("3 entradas generales: " + a.calcularPrecio(3));
            System.out.println("2 entradas VIP: " + b.calcularPrecio(2));
        }
    }
}