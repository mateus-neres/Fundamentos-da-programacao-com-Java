package fundamento;

public class A029_TipoString {

	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2)); // Em caso de valor literal, as funcionalidades diretamente se, o uso da variavel.
		
		String s = "Boa tarde";// A String é um valor imutavel ,sendo assim, o valor original atribuido a variavel não poderar ser alterado.
		System.out.println(s.concat("!!!")); // COncatenação é a junção entre 2 elementos em uma cadeia ou sequencia.
		System.out.println(s + "!!!"); // O sinal de + também pode ser ultilizado para concatenar como no exemplo ao lado.
		System.out.println(s.startsWith("Boa")); // A função .startsWith() serve para verificação do inicio da String.
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("boa")); // Aqui a funçao .LowerCase(), Passa a String para escrita em minusculo.
		System.out.println(s.length()); // A função .length(), retorna a quantidade de caractere de uma String.
		System.out.println(s.endsWith("tarde")); // A função endsWith(), verifica o final da String.
		System.out.println(s.equals("boa tarde")); // A função .equals() verifica a igualdade da String.
		System.out.println(s.equals("Boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde")); // A função .equalsIgnoreCase(), serve para comparar a String, independente se é maiuscula ou minuscula
		
		
		var nome = "Pedro";
		var sobreNome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		// Formas de expressa as variaveis em um texto.
		// Concatenção
		System.out.println("Nome: " + nome + " " + sobreNome + "\nIdade: " + idade + "\nRecebe: " + salario + "\n\n");
		
		// .printf
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f\n\n", nome, sobreNome, idade, salario);
		
		String teste = String.format("O senhor %s %s tem %d anos e ganha R$%.2f.\n\n", nome, sobreNome, idade, salario);
		System.out.println(teste);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual")); // A função .indexOf() Indica o indice onde inicia a primeira letra da busca.
		System.out.println("Frase qualquer".substring(6)); // A Função .substrig() retorna o valor apartir do indice que você escolheu.
		System.out.println("Frase qualquer".substring(6, 8)); // A função .substring() com 2 indicice, retornar todo os valores entre os indices escolhidos.
	}
	
}
