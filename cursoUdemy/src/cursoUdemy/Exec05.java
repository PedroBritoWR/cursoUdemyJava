package cursoUdemy;

import java.util.Scanner;

public class Exec05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo1, codigo2, num1, num2;
		double valor1, valor2;
		double resultado;
		
		codigo1 = sc.nextInt();
		num1 = sc.nextInt();
		valor1 = sc.nextDouble();
		codigo2 = sc.nextInt();
		num2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		resultado = (num1 * valor1) + (num2 * valor2);
		
		System.out.println("VALOR A PAGAR: " + resultado);
		
		sc.close();

	}

}
