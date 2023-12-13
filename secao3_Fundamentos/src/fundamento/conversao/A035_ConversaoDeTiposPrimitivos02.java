package fundamento.conversao;

public class A035_ConversaoDeTiposPrimitivos02 {

	public static void main(String[] args) {
		
		// Conversão implicita:
		
		double a = 1; //implicita
		System.out.println(a);
		// O valor 1 é inteiro, no entanto foi usado um tipo primitivo double, adicionando a ele o ponto flutuante.
		
		// Cnoversa explicita:
		
		float b = (float) 1.12345; //Explicita (CAST)
		System.out.println(b);
		// O float entre parenteses "(float)", serve para converter o valor para o float de forma literal. 
		// no caso a cima, tem-se a opção de ultilzar o "F" ao final do valor atribuido para o converte.
		//Ex:
		float b1 = 1.12345F; // O "F" ou "f", pode ser usado para conversão literal.
		System.out.println(b1);
		
		// Ex 2
		// Caso seja atribido um valor que o tipo primitivo não suporta, a variavel receberá o proximo valor endereçado.
		//Ex:
		int c = 128; // O Próximo número é o -128.  
		byte d = (byte)c;
		System.out.println(d);
	}
	
}
