package practica2;

import java.util.*;

public class ejercicio_1 {
	/**
	 * Ingresar 3 numeros enteros. Hallar la suma de los mayores a 30. Hallar la
	 * suma de los menores a 30. Y el promedio de los menores a 30 y mayores a 10.
	 * Usar if anidado
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int num1, num2, num3, cont = 0;

		System.out.println("Ingresar el primer número");

		num1 = in.nextInt();

		System.out.println("Ingresar el segundo número");

		num2 = in.nextInt();

		System.out.println("Ingresar el tercer número");

		num3 = in.nextInt();

		int sum = 0;

		int sum2 = 0;

		int sum3 = 0;

		float promedio;

		if (num1 > 30) {

			// n1 mayor a 30

			sum = sum + num1;

		} else {

			// n1 menor a 30

			sum2 = sum2 + num1;

			if (num1 > 10) {

				sum3 = sum3 + num1;

				cont++;

			}

		}

		if (num2 > 30) {

			// n2 mayor a 30

			sum = sum + num2;

		} else {

			// n2 menor a 30

			sum2 = sum2 + num2;

			if (num2 > 10) {

				sum3 = sum3 + num2;

				cont++;

			}

		}

		if (num3 > 30) {

			// n3 mayor a 30

			sum = sum + num3;

		} else {

			// n3 menor a 30

			sum2 = sum2 + num3;

			if (num3 > 10) {

				sum3 = sum3 + num3;

				cont++;

			}

		}

		// Hallar la suma de los mayores a 30

		System.out.println("La suma de los número mayores a 30 es " + sum);

		// Hallar la suma de los menores a 30

		System.out.println("La suma de los números menores a 30 es " + sum2);

		// Y el promedio de los menores a 30 y mayores a 10

		promedio = sum3 / cont;

		System.out.println("El promedio de los menores a 30 y mayores a 10 es " + promedio);
	}

}
