/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2;

/**
 *
 * @author 503
 */
public class Heroe {
    public String nombre;
    private int edad;
    
    public Heroe() {
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad>1 && edad<100){
            this.edad = edad;            
        }else{
            System.out.println("Edad inválida");
        }
    }
}
