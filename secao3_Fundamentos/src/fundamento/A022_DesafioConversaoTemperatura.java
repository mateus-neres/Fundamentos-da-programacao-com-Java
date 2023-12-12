package fundamento;

public class A022_DesafioConversaoTemperatura {
	public static void main(String[] args) {
		
		// Desafio, conversão de Fahrenheit, (°F -32) * 5.0 / 9.0 = °C
		
		// Constantes
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		
		//Variaveis
		double fahrenheit = 86;
		
		// Tratamento de dados
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		// Saída de dados
		System.out.println(fahrenheit + "°F = " + celsius + "°C");
		
	}
}