/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import array2.Heroe;
import java.util.Scanner;

/**
 *
 * @author 503
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digita un número:");
        int h = entrada.nextInt();
        int[] numeros = new int[h];
        
        for(int i=0; i<numeros.length; i++){
            numeros[i]=h;
            System.out.println(numeros[i]);
            h++;
        }
    } 
}
