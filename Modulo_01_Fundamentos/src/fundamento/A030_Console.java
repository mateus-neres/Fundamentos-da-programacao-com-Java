package fundamento;

import java.util.Scanner;

public class A030_Console {

	public static void main(String[] args) {
		
		// Tipos de print:
		
		// System.out.print(), Exibe no console informações em linha unica, segue exemplo abaixo.
		System.out.print("Bom");
		System.out.print(" dia");
		System.out.println("!\n\n");
		// As 3 saidas a cima exibiram  "Bom dia!" em uma unica linha.
		
		// System.out.println(), Exibe no console informações com uma quebra de linha para o proximo comando, segue exemplo abaixo.
		System.out.println("Bom");
		System.out.println("dia");
		System.out.println("!\n\n");
		/* 
		* As 3 saidas a cima exibiram "Bom", "dia" e "!" em linhas separadas, segue exempro:
		* Bom
		* dia
		* !
		*/
		
		// System.out.printf(), Permite a ultilização de complementos em uma sentesa de código ultilizando "%"com a saida de dados, segue exemplo abaixo.
		System.out.printf("Megasena: %d %d %d %d %d %d\n", 1, 2, 3, 4, 5, 6); // Utilize "\n" para realizar uma quebra de linha quando não utilizar o println
		System.out.printf("Salário: R$ %s\n", 1400.500); // Utilize "\n" para realizar uma quebra de linha quando não utilizar o println
		// Você também pode complementar a saida de dados para formatar em ponto flutuante ultilizando o comando ".nf", onde n representa um valor inteiro, exemplo:
		System.out.printf("Salário: R$ %.2f\n\n", 1400.500); // A sentença deve exibir: Salário: R$ 1400.50
		
		// Scanner
		
		// o Scanner, permite que você receba e armazene informações do usuario.
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine(); // Ao atribuir o .nextLine() a uma variave, posso aramazenar as informações postas pelo usuário e ultilizar em outro momento.
		
		System.out.print("Digite seu sobrenome: ");
		String SobreNome = entrada.nextLine(); /*
		O .NextLine(), recebe como entrada uma String, para receber um valor numerico, use o .nextTipo, Onde "Tipo" representa 
		o tipo de dados que você deseja, lembrando que o Tipo tem que iniciar com letra maiuscula.
		Segue exemplo abaixo:
		*/
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		
		System.out.printf("Nome: %s %s\nSua idade é: %s", nome, SobreNome, idade);
		
		entrada.close(); // Ao final do scanner indica-se fechar ele para que sua máquina não permaneça utilizando recursos.
	}
	
}
