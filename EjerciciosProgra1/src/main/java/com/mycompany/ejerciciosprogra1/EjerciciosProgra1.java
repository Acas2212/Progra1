/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosprogra1;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class EjerciciosProgra1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Selecciona una opcion:");
            System.out.println("1. Formula Cuadratica");
            System.out.println("2. Numero Palindromo");
            System.out.println("3. Numero Vampiro");
            System.out.println("4. Palabra Palindroma");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    FormulaCuadratica(); 
                    break;
                case 2:
                    NumeroPalindromo(); 
                    break;
                case 3:
                    NumeroVampiro();
                    break;
                case 4:
                    PalabraPalindroma();
                    break;                    
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }

        private static void FormulaCuadratica() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void NumeroPalindromo() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void NumeroVampiro() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void PalabraPalindroma() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
