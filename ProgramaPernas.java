package ExerciciosAutonomos;

import java.util.Scanner;

public class ProgramaPernas {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Quantas pernas? ");
		int pernas = tec.nextInt();
		String tipo;
		System.out.print("Isso é um(a) ");
		switch(pernas) {
		case 1 :
			tipo = "Saci";
			break;
		case 2 :
			tipo = "Bípede";
			break;
		case 3:
			tipo = "Tripé";
			break;
		case 4:
			tipo = "Quadrupede";
			break;
		case 6:
			tipo = "Aranha";
			break;
		default:
			tipo = "ET";
		break;
				}
		tec.close();
		
		System.out.println(tipo);
	
	}

}
