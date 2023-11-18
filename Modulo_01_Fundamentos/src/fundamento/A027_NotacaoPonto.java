package fundamento;

public class A027_NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.concat("!!!");
		s = s.toUpperCase(); // O ponto após a variavel, permite aplicar funções.
		
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X".replace("X", "Gui").toUpperCase().concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos não tem o operador "."
		int a = 3;
		a. // O ponto nesse caso não chama a função a ser executada
			
		
	}
}