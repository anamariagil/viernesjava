/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import array2.Heroe;

/**
 *
 * @author 503
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Heroe heroe = new Heroe();
        Enemigo enemigo = new Enemigo();
        
        enemigo.nombre="h";
        heroe.nombre="j";
        heroe.setEdad(300);
    } 
}
