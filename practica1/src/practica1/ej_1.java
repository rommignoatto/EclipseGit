
package practica1;

import java.util.Scanner;
/**
 * 
 * Realizar un programa que ingrese 2 numeros enteros. Hallar el numero mayor a 20. Y hallar el numero mayor a 20 pero menor a 50.
 *
 */
public class ej_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n1, n2;
		System.out.println("Escriba un número" );
		n1=in.nextInt();
		System.out.println("Escriba un número");
		n2=in.nextInt();
		if (n1>20) {
			
			System.out.println("El número 1 es mayor a 20");
		}if (n1>20 && n1<50) {
			System.out.println("El número 1 es mayor a 20 y menor que 50");
		}
		if (n2>20) {
			
			System.out.println("El número 2 es mayor a 20" );
		}if (n2>20 && n2<50) {
			System.out.println("El número 2 es mayor a 20 y menor que 50");
		}
	}

}
