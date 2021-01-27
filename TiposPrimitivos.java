package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informa��es do funcion�rio

		// Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;

		// Tipos num�ricos reais
		float salario = 11_445.44F;
		double vendaAcumulada = 2_991_797_103.01;

		// Tipo booleano
		boolean estaDeFerias = false; // true
		char status = 'A'; // Ativo

		// Dias de empresa
		System.out.println("O colaborador trabalha a " + anosDeEmpresa * 365 + " dias na empresa");

		// N�mero de viagens

		// Pontos por real
		System.out.println("O colaborador tem " + pontosAcumulados / vendaAcumulada + " pontos acumulados por vendas");

		// Salario por ID

		System.out.println("O Colaborador id " + id + " ganha R$ " + salario + " de sal�rio mensal");

		// status de f�rias
		System.out.println("O colaborador est� de f�rias? " + estaDeFerias);

		System.out.println("O colaborador j� fez " + numeroDeVoos / 2 + " viagens na empresa");
		// Status
		System.out.println("Status do colaborador: " + status);

	}
}
