package practica2;

import java.util.Scanner;

/*
 * Ingresar 3 numeros enteros. Hallar el numero máximo. El promedio de los
 *mayores a 50 pero menores a 100. La cantidad de los números menores a
 *50 pero mayores a 10. La suma de los valores menores a 50 pero pares .
 *Usar if else o if-else-if
*/
public class ejercicio_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2, num3, maxi = 0, sum = 0, cont = 0, cont2 = 0, sum2 = 0;
		float promedio;
		System.out.println("Ingresar el primer número");
		num1 = in.nextInt();
		System.out.println("Ingresar el segundo número");
		num2 = in.nextInt();
		System.out.println("Ingresar el tercer número");
		num3 = in.nextInt();

		// Hallar el numero máximo

		if (num1 > num2 && num1 > num3) {
			maxi = num1;
			System.out.println("El número máximo es " + maxi);
		} else if (num2 > num1 && num2 > num3) {
			maxi = num2;
			System.out.println("El número máximo es " + maxi);
		} else {
			maxi = num3;
			System.out.println("El número máximo es " + maxi);
		}

		// El promedio de los mayores a 50 pero menores a 100
		
		if (num1 > 50) {
			if (num1 <100) {
				sum = sum + num1;
				cont++;
			}
		}else if (num1 < 50) {
			if(num1 % 2 == 0) {
				sum2 = sum2 + num1;
			}if(num1 >10) {
			cont2++;
		}
		}
		if (num2 > 50) {
			if (num2 <100) {
				sum = sum + num2;
				cont++;
			}
		}else if (num2 < 50) {
			if(num2 % 2 == 0) {
				sum2 = sum2 + num2;
			}if(num2 >10) {
			cont2++;
		}
		}
		if (num3 > 50) {
			if (num3 <100) {
				sum = sum + num3;
				cont++;
			}
		}else if (num3 < 50) {
			if(num3 % 2 == 0) {
				sum2 = sum2 + num3;
			}if(num3 >10) {
			cont2++;
		}
		}
		promedio = sum/cont;
		System.out.println("El promedio de los números mayores a 50 y menores a 100 es " + promedio);
		System.out.println("Los números menores a 50 pero mayores a 10 son " + cont2);
		System.out.println("La suma de los números pares menores a 50 es " + sum2);

	}

}
