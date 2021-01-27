package ExerciciosAutonomos;

import java.util.Scanner;

public class numeros {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite o nome do aluno: ");
		String nome = teclado.nextLine();

		System.out.print("Digite a nota do aluno: \n \n");
		double nota = teclado.nextDouble();

		System.out.print("Olá " + nome + ", sua nota é " + nota + "\n \n");

		System.out.println("Olá " + nome + ", sua nota é " + nota + "\n \n");

		System.out.printf("Olá %S sua nota é %.1f \n \n", nome, nota);

		System.out.format("Olá %S sua nota é %.1f \n \n", nome, nota);

	teclado.close();
	}
	

}
