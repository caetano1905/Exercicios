package ExerciciosAutonomos;

import java.util.Scanner;

public class numeros {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite o nome do aluno: ");
		String nome = teclado.nextLine();

		System.out.print("Digite a nota do aluno: \n \n");
		double nota = teclado.nextDouble();

		System.out.print("Ol� " + nome + ", sua nota � " + nota + "\n \n");

		System.out.println("Ol� " + nome + ", sua nota � " + nota + "\n \n");

		System.out.printf("Ol� %S sua nota � %.1f \n \n", nome, nota);

		System.out.format("Ol� %S sua nota � %.1f \n \n", nome, nota);

	teclado.close();
	}
	

}
