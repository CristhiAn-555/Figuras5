/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.figurasgeometrica;

/**
 *
 * @author PERSONAL
 */
public class Triangulo {

    public double base;
    public double altura;

    public double áreaTriangulo() {
        double area = (base * altura) / 2;
        return area;
    }

    public double hipotenusa() {
        double hipotenusa = Math.sqrt((base * base) + (altura * altura));
        return hipotenusa;
    }

    public double perímetroTriangulo() {
        double Perimetro = base + altura + hipotenusa();
        return Perimetro;
    }

    public TipoTriangulo identificarTriangulo() {
        double hipotenusa = hipotenusa();

        if (base == altura && base == hipotenusa) {
            return TipoTriangulo.EQUILATERO;
        } else if (base == altura || base == hipotenusa || altura == hipotenusa) {
            return TipoTriangulo.ISOSCELES;
        } else {
            return TipoTriangulo.ESCALENO;
        }
    }
}
