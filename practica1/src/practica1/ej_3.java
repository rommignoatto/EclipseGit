package practica1;
import java.util.*;
/*
 * Realizar un programa que ingrese 2 	numeros enteros. Hallar el promedio de aquellos numeros que no sean mayores a 20. Usar casting en el codigo
 */
public class ej_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n1, n2;
		float promedio;
		System.out.println("Escriba un número" );
		n1=in.nextInt();
		System.out.println("Escriba un número");
		n2=in.nextInt();
		if (n1<20 && n2<20) {
			promedio=(float)(n1+n2)/2;
			System.out.println("El promedio de los dos número menores a 20 es " + promedio);
		}
		if (n1>20 || n2>20 ) {
			System.out.println("Al menos uno de los números es mayor a 20");
		}
	}

}
