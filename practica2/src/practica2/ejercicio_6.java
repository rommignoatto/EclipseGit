package practica2;
//Ingresar 3 numeros en un for y hallar el m�ximo.

import java.util.Scanner;

public class ejercicio_6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int max = 0;

		for (int i = 0; i <= 2; i++) {
			System.out.println("Ingrese un n�mero");
			int num = in.nextInt();
			if (num > max) {
				max = num;
			}
			
		}System.out.println("El mayor es "+max);
	}
}
