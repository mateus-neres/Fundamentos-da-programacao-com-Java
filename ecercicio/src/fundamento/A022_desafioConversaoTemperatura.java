package fundamento;

public class A022_desafioConversaoTemperatura {
	public static void main(String[] args) {
		// Desafio, conversão de Fahrenheit, (°F -32) * 5.0 / 9.0 = °C
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		double fahrenheit = 86;
		
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		
		System.out.println(fahrenheit + "°F = " + celsius + "°C");
		
	}
}