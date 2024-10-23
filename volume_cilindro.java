package aula05;

import java.util.Scanner;

public class volume_cilindro {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Digite o valor do raio: ");
		double raio = scn.nextDouble();
		
		System.out.println("Digite a altura");
		double altura = scn.nextDouble();
		
	
		//double volume = 3.14159 * raio * raio * altura;
		double volume = 3.14159 * Math.pow(raio, 2) * altura;
		
		System.out.println("O volume - " + volume);
		
	}

}
