package cursoUdemy;

import java.util.Scanner;

public class Exec04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number, hours;
		double horasTrabalhadas;
		double salary;
		number = sc.nextInt();
		hours = sc.nextInt();
		horasTrabalhadas = sc.nextDouble();
		
		salary = hours * horasTrabalhadas;
		
		System.out.println(number);
		System.out.printf("salary: U$ = %.2f %n", salary);
		
		
		
		
		sc.close();
	}

}
