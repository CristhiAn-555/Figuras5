/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.figurasgeometrica;

/**
 *
 * @author PERSONAL
 */
public class Rectangulo {
    public double base;
    public double altura;
    
    public double perímetrorectángulo(){
        double perímetro=(base*2)+(altura*2);
        return perímetro;
    }
    
    public double árearectángulo(){
        double Area = base*altura;
        return Area;   
    }
}
