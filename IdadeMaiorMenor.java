package ExerciciosAutonomos;

import java.util.Scanner;

public class IdadeMaiorMenor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Qual � o ano do seu nascimento? ");
		int nsto = teclado.nextInt();
		
		int i = 2020 - nsto;
		
		if (i>18) {
			System.out.println("Voc� j� � Maior de idade");
		}else {
			System.out.println("Voc� ainda � Menor de idade");
			
		}
		
		teclado.close();
			}
}
