package fundamento;

import java.util.Scanner;

public class A038_DesafioConversao {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salario: ");
		double PrimeiroSalario = teclado.nextDouble();
		
		System.out.println("Digite o segundo salario: ");
		double SegundoSalario = teclado.nextDouble();		
		System.out.println("Digite o terceiro salario: ");
		double TerceiroSalario = teclado.nextDouble();
		double media = ( PrimeiroSalario + SegundoSalario + TerceiroSalario ) / 3;
		System.out.printf("A media é: %.2f", media);
	}
	
	//Ultimos 3 salarios de 3 funcionarios e calcule a media dos ultimos 3 salarios esses valores sendo com . ou com ,
}
 