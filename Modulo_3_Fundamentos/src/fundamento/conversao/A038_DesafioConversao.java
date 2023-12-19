package fundamento.conversao;

import java.util.Scanner;

public class A038_DesafioConversao {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salario: ");
		String PrimeiroSalario = teclado.next().replace(",", ".");
		
		System.out.println("Digite o segundo salario: ");
		String SegundoSalario = teclado.next().replace(",", ".");
		
		System.out.println("Digite o terceiro salario: ");
		String TerceiroSalario = teclado.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(PrimeiroSalario);
		double salario2 = Double.parseDouble(SegundoSalario);
		double salario3 = Double.parseDouble(TerceiroSalario);
		
		double media = ( salario1 + salario2 + salario3 ) / 3;
		System.out.printf("A media é: %.2f", media);
		
		teclado.close();
	}
	
	//Ultimos 3 salarios de 3 funcionarios e calcule a media dos ultimos 3 salarios esses valores sendo com . ou com ,
}
 