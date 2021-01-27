package fundamentos;

import java.util.Scanner;

public class FormulaDeBhaskara {
	public static void main(String[] args) {
		
		// x'= -b + raiz de (b² - 4ac) / 2a
		// x''= -b - raiz de (b² - 4ac) / 2a
		
		Scanner entrada = new Scanner(System.in);
		
			System.out.print("Digite o valor de aX² :  ");
			double numa = entrada.nextDouble();
		
			System.out.print("Digite o valor de bX :  ");
			double numb = entrada.nextDouble();
		
			System.out.print("Digite o valor de c :  ");
			double numc = entrada.nextDouble();
		
		entrada.close();
		
			double a = numa;
			double b = numb;		
			double c = numc;
			double delta = ((Math.pow(b,2))-(4*a*c));
			double num1 = Math.sqrt(delta);
			double num2 = 2*a;	
			double px1 = (-1*b) + num1;
			double px2 = (-1*b) - num1;
			double x1 = px1 / num2;
			double x2 = px2 / num2;
					
				System.out.println("Para a equação " + a + "X² " + b + "X " + c + " , temos:");
				System.out.println("X' = " + x1);
				System.out.println("X'' = " + x2);
			
		
			
		
	}

}
