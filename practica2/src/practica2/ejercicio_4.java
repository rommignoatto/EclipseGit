package practica2;

import java.util.*;
/*
 * Usar la función random. Asignar un rango de valores para el random. Asignarle a 3 variables números aleatorios. Hallar la suma de las 2
 *variables.
 */

public class ejercicio_4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int max, min, value;
		double a = Math.random();
		double b = Math.random();
		double c = Math.random();

		Random random = new Random();
		System.out.println("Ingresar rango máximo");
		max = in.nextInt();
		System.out.println("Ingresar rango mínimo");
		min = in.nextInt();
		value = random.nextInt(max - min) + min;
		System.out.println(value);
		System.out.println("Variable a: " + a);
		System.out.println("Variable b: " + b);
		System.out.println("Variable c: " + c);
		double sum = a+b+c;
		System.out.println("La suma de las 3 variables es " + sum);
	}

}
