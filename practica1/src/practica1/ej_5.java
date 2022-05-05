package practica1;
import java.util.*;
/*
 * Realizar un programa que ingrese 3 numeros enteros. Hallar el porcentaje de numeros mayores a 50 pero menores a 70.
 */
public class ej_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n1, n2,n3, cont=0;
		float porcentaje;
		System.out.println("Escriba un número" );
		n1=in.nextInt();
		System.out.println("Escriba un número");
		n2=in.nextInt();
		System.out.println("Escriba un número");
		n3=in.nextInt();
		if(n1>50 && n1 <70) {
			cont++;
		}
		if(n2>50 && n2 <70) {
			cont++;
		}
		if(n3>50 && n3 <70) {
			cont++;
		}
		porcentaje = cont*100/3;
		System.out.println(porcentaje);
	}

}
