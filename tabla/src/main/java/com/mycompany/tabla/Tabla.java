/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabla;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Tabla {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("La suma");
        System.out.print("INGRESE EL PRIMER NUMERO: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("INGRESE EL SEGUNDO NUMERO: ");
        int numero2 = scanner.nextInt();
        
        int suma = numero1 + numero2;
        System.out.println("la suma de " + numero1 + " + " + numero2 + " es: " + suma);
        System.out.println();
        
        System.out.println("La Resta");
        System.out.print("INGRESE EL PRIMER NUMERO: ");
        int numero3 = scanner.nextInt();
        
        System.out.print("INGRESE EL SEGUNDO NUMERO: ");
        int numero4 = scanner.nextInt();
        
        int resta = numero3 - numero4;
        System.out.println("la resta de " + numero3 + " - " + numero4 + " es: " + resta);
        System.out.println();
        
        System.out.println("La Division"); 
        System.out.print("INGRESE EL PRIMER NUMERO: ");
        int numero5 = scanner.nextInt();
        
        System.out.print("INGRESE EL SEGUNDO NUMERO: ");
        int numero6 = scanner.nextInt();
        
        int division = numero5 / numero6;
        System.out.println("la resta de " + numero5 + " / " + numero6 + " es: " + division);
        System.out.println();
        
    }
}
