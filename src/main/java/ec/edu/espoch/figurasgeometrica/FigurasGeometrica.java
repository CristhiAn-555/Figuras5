/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.figurasgeometrica;

/**
 *
 * @author PERSONAL
 */
public class FigurasGeometrica {

    public static void main(String[] args) {
       // CÁLCULO DEL ÁREA Y PERÍMETRO DE UN RECTÁNGULO
        Rectangulo objRectangulo = new Rectangulo();
        objRectangulo.base = 18;
        objRectangulo.altura = 12;

        double áreaRectángulo = objRectangulo.árearectángulo();
        System.out.println("El área del rectángulo es: " + áreaRectángulo + " cm cuadrados");

        double perímetroRectángulo = objRectangulo.perímetrorectángulo();
        System.out.println("El perímetro del rectángulo es: " + perímetroRectángulo + " cm");

        System.out.println("");

        // CÁLCULO DE LA HIPOTENUSA DE UN TRIÁNGULO
        Triangulo objTriangulo = new Triangulo();
        objTriangulo.base = 10;
        objTriangulo.altura = 20;

        double hipotenusa = objTriangulo.hipotenusa();
        System.out.println("La hipotenusa del triángulo es: " + hipotenusa + " cm");

        double áreaTriangulo = objTriangulo.áreaTriangulo();
        System.out.println("El área del triángulo es: " + áreaTriangulo);

        double perímetroTriangulo = objTriangulo.perímetroTriangulo();
        System.out.println("El perímetro del triángulo es: " + perímetroTriangulo);

        TipoTriangulo tipo  = objTriangulo.identificarTriangulo();
        System.out.println("El tipo de triángulo es: " + tipo);

        System.out.println("IMPORTANTE: Debido a que el tercer lado es la hipotenusa, estamos trabajando con triángulos rectángulos");
        System.out.println("Por lo tanto, no pueden existir triángulos equiláteros en este caso.");

        System.out.println("");

        // ÁREA Y PERÍMETRO DE UN CUADRADO
        Cuadrado objCuadrado = new Cuadrado();
        objCuadrado.lado = 10;

        double áreaCuadrado = objCuadrado.calcularÁrea();
        System.out.println("El área del cuadrado es: " + áreaCuadrado);

        double perímetroCuadrado = objCuadrado.calcularPerímetro();
        System.out.println("El perímetro del cuadrado es: " + perímetroCuadrado);

        System.out.println("");

        // ÁREA Y PERÍMETRO DE UN CÍRCULO
        Circulo objCirculo = new Circulo();
        objCirculo.radio = 7;

        double áreaCírculo = objCirculo.areacircular();
        System.out.println("El área del círculo es: " + áreaCírculo);

        double perímetroCírculo = objCirculo.perimetrocircular();
        System.out.println("El perímetro del círculo es: " + perímetroCírculo);
    }
    
}
