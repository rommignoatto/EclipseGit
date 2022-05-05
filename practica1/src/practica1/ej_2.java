package practica1;

import java.util.*;
/**
 * 
 * Realizar un programa que ingresen 2 numeros enteros. Hallar el valor maximo y el valor minimo.
 *
 */
public class ej_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n1, n2, maxi, mini;
		System.out.println("Escriba un número");
		n1 = in.nextInt();
		System.out.println("Escriba un número");
		n2 = in.nextInt();
		if (n1 > n2) {
			maxi = n1;
			System.out.println(maxi + " es el máximo");
		}if (n1<n2) {
			mini=n1;
			System.out.println(mini + " es el mínimo");
		}
		if (n2 > n1) {
			maxi = n2;
			System.out.println(maxi + " es el máximo");
		}if (n2<n1) {
			mini=n2;
			System.out.println(mini + " es el mínimo");
		}
		
	}

}
