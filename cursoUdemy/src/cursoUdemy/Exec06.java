package cursoUdemy;

import java.util.Scanner;

public class Exec06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double a, b, c, pi = 3.14159;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		double TRIANGULO = a*c / 2;
		
		double CIRCULO = c * c * pi;
		
		double TRAPEZIO = (a + b) / 2 * c;
		
		double QUADRADO = b * b;
		
		double RETANGULO = a * b;
		
		System.out.println("TRIANGULO: " + TRIANGULO);
		System.out.println("CIRCULO: " + CIRCULO);
		System.out.println("TRAPEZIO: " + TRAPEZIO);
		System.out.println("QUADRADO: " + QUADRADO);
		System.out.println("RETANGULO: " + RETANGULO);
		
		sc.close();
		
		
	}

}
