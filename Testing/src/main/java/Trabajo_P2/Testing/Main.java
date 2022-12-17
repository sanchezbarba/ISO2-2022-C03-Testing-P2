package Trabajo_P2.Testing;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Trabajo-P2-Testing
 *
 */
public class Main 
{
	final static Scanner TECLADO = new Scanner(System.in);
    public static void main( String[] args )
    {
    	try {
			System.out.println("Introduzca la longitud de los lados del triangulo");
			System.out.println("Lado 1:");
			int lado1 = TECLADO.nextInt();
			Triangulo.comprobarNum(lado1);
			System.out.println("Lado 2:");
			int lado2 = TECLADO.nextInt();
			Triangulo.comprobarNum(lado2);
			System.out.println("Lado 3:");
			int lado3 = TECLADO.nextInt();
			Triangulo.comprobarNum(lado3);
			System.out.println("Introduzca los grados de los angulos del triangulo");
			System.out.println("Ángulo 1:");
			int angulo1 = TECLADO.nextInt();
			Triangulo.comprobarAngulo(angulo1);
			System.out.println("Ángulo 2:");
			int angulo2 = TECLADO.nextInt();
			Triangulo.comprobarAngulo(angulo2);
			System.out.println("Ángulo 3:");
			int angulo3 = TECLADO.nextInt();
			Triangulo.comprobarAngulo(angulo3);

			Triangulo triangulo = new Triangulo(lado1, lado2, lado3, angulo1, angulo2, angulo3);

			boolean ladosCorrectos = Triangulo.comprobarLado3(triangulo);

			boolean angulosCorrectos = Triangulo.trianguloValido(triangulo);

			if ((!ladosCorrectos) || (!angulosCorrectos))
				System.out.println(
						"La longitud de los lados o los ángulos especificados no permiten formar un triángulo");

			if (ladosCorrectos && angulosCorrectos) {
				System.out.println(
						"El triángulo es " + triangulo.getTipoSegunLado() + " segun sus lados y " + triangulo.getTipoSegunAngulo() + " segun sus angulos");
			}

		} catch (InputMismatchException e) {
			System.out.println("Error, debe introducir un valor entero.");
		} catch (numNegativoException e) {
			e.printStackTrace();
		} catch (anguloException e) {
			e.printStackTrace();
		}
    }
}
