/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p1_ramonnolasco;

import java.util.Scanner;

/**
 *
 * @author ramon
 */
public class Lab1P1_RamonNolasco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("CALCULADORA DE INDICE DE MASA CORPORAL");
        
        System.out.print("Ingrese el peso en kilogramos: ");
        double peso = entrada.nextDouble();
        
        System.out.print("Ingrese la altura en metros: ");
        double altura = entrada.nextDouble();
        
        double imc = peso/(altura * altura);
        
        System.out.println("El indice de masa corporal es de: " + imc);
    }
    
}
