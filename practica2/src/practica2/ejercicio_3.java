package practica2;

import java.util.Scanner;

/*
 * Ingresar 4 numeros enteros. Hallar la cantidad de números mayores a 100.
 *La suma de los mayores a 100 pero menores a 300. El promedio de los
 *números menores a 100. Usar if else o if-else-if
 */
public class ejercicio_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2, num3, num4, cont = 0, sum = 0, cont2 = 0, sum2 = 0;
		float prom;

		System.out.println("Ingresar el primer número");
		num1 = in.nextInt();
		System.out.println("Ingresar el segundo número");
		num2 = in.nextInt();
		System.out.println("Ingresar el tercer número");
		num3 = in.nextInt();
		System.out.println("Ingresar el cuarto número");
		num4 = in.nextInt();

		
		
		if  (num1 >100) {
			cont++;
			if (num1 <300) {
				sum = sum + num1;
			}
		}else {
			sum2 = sum2 + num1;
			cont2++;
		}
		if  (num2 >100) {
			cont++;
			if (num2 <300) {
				sum = sum + num2;
			}
		}else {
			sum2 = sum2 + num2;
			cont2++;
		}
		if  (num3 >100) {
			cont++;
			if (num3 <300) {
				sum = sum + num3;
			}
		}else {
			sum2 = sum2 + num3;
			cont2++;
		}
		if  (num4 >100) {
			cont++;
			if (num4 <300) {
				sum = sum + num4;
			}
		}else {
			sum2 = sum2 + num4;
			cont2++;
		}
		prom = sum2 / cont2;
		System.out.println("Los números mayores a 100 son " + cont);
		System.out.println("La suma de los mayores a 100 pero menores a 300 es " + sum);
		System.out.println("El promedio de los números menores a 100 es " + prom);

	}

}
