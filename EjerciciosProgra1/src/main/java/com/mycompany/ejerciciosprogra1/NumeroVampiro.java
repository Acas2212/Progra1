/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosprogra1;

/**
 *
 * @author Usuario
 */
import java.util.Arrays ;
public class NumeroVampiro {


    public class Vampiro {

        public static boolean esVampiro(int numero) {
            String numeroStr = String.valueOf(numero);
            int longitud = numeroStr.length();

            for (int i = 1; i <= longitud / 2; i++) {
                for (int j = i; j <= longitud - i; j++) {
                    int colmillo1 = Integer.parseInt(numeroStr.substring(0, i));
                    int colmillo2 = Integer.parseInt(numeroStr.substring(i, longitud));
                    if (colmillo1 * colmillo2 == numero && colmillo1 % 10 != 0 && colmillo2 % 10 != 0) {
                        char[] numArray = String.valueOf(numero).toCharArray();
                        char[] colmilloArray = (String.valueOf(colmillo1) + String.valueOf(colmillo2)).toCharArray();
                        Arrays.sort(numArray);
                        Arrays.sort(colmilloArray);
                        if (Arrays.equals(numArray, colmilloArray)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public static void main(String[] args) {
            int inicio = 1000;
            int fin = 10000;

            for (int i = inicio; i < fin; i++) {
                if (esVampiro(i)) {
                    System.out.println("El primer número vampiro es: " + i);
                    break;
                }
            }
        }
    }

}
