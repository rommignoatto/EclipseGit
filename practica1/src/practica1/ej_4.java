package practica1;
import java.util.*;
/*
 * Realizar un programa que ingrese 3 numeros con decimales(usar float o double). Hallar la suma de los numeros. Y hallar el maximo valor.
 */
public class ej_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		float n1, n2,n3,suma, maxi=0;
		System.out.println("Escriba un número decimal" );
		n1=in.nextFloat();
		System.out.println("Escriba un número decimal");
		n2=in.nextFloat();
		System.out.println("Escriba un número decimal");
		n3=in.nextFloat();
		suma=n1 + n2 + n3;
		System.out.println("La suma de los tres números es " + suma);
		if (n1 > n2 && n1>n3) {
			maxi=n1;
			
		}if (n2 > n1 && n2>n3) {
			maxi=n2;
			
		}if (n3 > n1 && n3>n2) {
			maxi=n3;
			
		}
		System.out.println("El número mayor es " + maxi);
	}
}
