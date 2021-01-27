package ExerciciosAutonomos;

import java.util.Scanner;

public class IdadeMaiorMenor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Qual é o ano do seu nascimento? ");
		int nsto = teclado.nextInt();
		
		int i = 2020 - nsto;
		
		if (i>18) {
			System.out.println("Você já é Maior de idade");
		}else {
			System.out.println("Você ainda é Menor de idade");
			
		}
		
		teclado.close();
			}
}
