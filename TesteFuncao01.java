package ExerciciosAutonomos;

public class TesteFuncao01 {
	
	static void soma (int a, int b) {
		int s = a + b;
		System.out.println("O valor da soma entre " + a + " e " + b + " é igual a " + s);
	}
	
	static int mais (int a, int b) {
		int s = a + b;
		return s;
		
	}
	
	public static void main(String[] args) {

		soma(5,6);
		soma(7,12);
		
		int sm = mais (5,8);
		System.out.println("A soma vale " + sm);
		
		}
}
