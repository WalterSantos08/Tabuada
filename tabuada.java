/* Crie um programa que receba um número inteiro e imprima a tabuada desse número (de 1 a 10).*/

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite um numero: ");
		
		int numero = entrada.nextInt();
		
		for (int n = 1; n <= 10; n++)
			System.out.println("a tabuada de"+ " "+ numero + "X" + n + " " + "é =" + " " + numero * n );
		
		
		entrada.close();

	}

}
