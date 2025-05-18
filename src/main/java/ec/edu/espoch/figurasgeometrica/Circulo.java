/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.figurasgeometrica;

/**
 *
 * @author PERSONAL
 */
public class Circulo {
    public double radio;
    
    public double areacircular(){
        double Areacircular=radio*3.14159;
        return Areacircular;
    }
    
    public double perimetrocircular(){
        double circulo=(3.14159*2)*radio;
        return circulo;
    }

}
