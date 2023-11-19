package fundamento;

import java.util.Date;

public class A028_Import {
	public static void main(String[] args) {
		
		String s = "Bom dia!!"; // Funções como o String, podem ser ultilizada diretamente.
		System.out.println(s);
		
		
		Date d = new Date(); // Funções como o Date, JButton e outras precisam de um impoprte para que possam ser acessadas.
		System.out.println(d);
		
		//JButton botao = new JButton();
		
	}
}
