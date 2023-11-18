package fundamento;

public class A026_tiposPrimitivos02 {
	public static void main(String[] args) {
		
		 //Informações de um funcionaris
		
		 // Tipos numericos:
		byte anosDeEmpresa = 23; // Armazenamento de 1 byte ou 8 bits, varia entre -128 e +128
		short numeroDeVoos = 542; // Amazenamento de 2 bytes ou 16 bits, varia entre -32.768 e + 32.768
		int id = 56789; // Amazenamento de 4 bytes ou 32 bits, varia entre -2.147.483.648 e +2.147.483.648
		long pontosAcumulados = 3_234_845_223L; // Amazenamento de 8 bytes ou 64 bits, varia entre -9.223.372.036.854.775.808 e +9.223.372.036.854.775.808 
		// O "L" ou "l" serve para que o tipo primitivo entenda que o valor é um "long" e não um "int".
		
		// tipos numericos reais
		float salario = 11_445.44F; // O "F" ou "f" serve para que o tipo primitivo entenda que o valor é um "float" e não um "double".
		double vendasAcumuladas = 2_991_797_103.01; 
		
		// Tipos booleano
		boolean estaDeFerias = false; // ou true; Diferente de outras linguagens, o java aceita apena os valores "true" ou "false" no tipo primitivo boolean.
		
		// Tipos caractere
		char status = 'A'; // O "char" recebe apenas um caractere entre aspas simples ' '.
		
		// Dias de empresa 
		System.out.println(anosDeEmpresa * 365);
		
	}
}
