package practica2;
//Ingresar un numero. Hallar si es primo o no. Usar for

import java.util.Scanner;

public class ejercicio_5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, cont = 0;
		System.out.println("Ingresar un número");
		num1 = in.nextInt();

		for (int i = 1; i <= num1; i++) {

			if (num1 % i == 0) {
				cont++;
			}
		}
		if (cont == 2) {
			System.out.println("El número es primo");
		} else {
			System.out.println("El número no es primo");
		}
	}

}
