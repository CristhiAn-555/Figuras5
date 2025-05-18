/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.figurasgeometrica;

/**
 *
 * @author PERSONAL
 */
public class Cuadrado {
     public double lado;
    
    public double calcularÁrea(){
        double area= (lado *lado);
        return area;
}
    public double calcularPerímetro(){
        double perimetro=(lado*4);
        return perimetro;
    }
}
