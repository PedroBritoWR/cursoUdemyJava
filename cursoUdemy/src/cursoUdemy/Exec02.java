package cursoUdemy;

import java.util.Scanner;

public class Exec02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		double pi = 3.14159;
		
		double saida = (raio * 2) * pi;
		System.out.printf("%.4f", saida);
		
		sc.close();
	}

}
