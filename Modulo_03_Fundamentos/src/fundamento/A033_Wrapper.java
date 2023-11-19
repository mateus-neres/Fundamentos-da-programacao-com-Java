package fundamento;

import java.util.Scanner;

public class A033_Wrapper {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		/*Pode ser usado nesse contexto para receber as informações 
		 * do usuário e converter para outros valores.*/
		
		/* 
		 * Para utilizar o Wrapper, pasta apenas alterar a primeira letra do tipo primitivo para maiuscula. 
		 * Ex: "byte" é um tipo primitivo, para o transformar em wrapper, basta fazer "Byte", e assim você terá um tipo primitivo como
		 * Obijeto. 
		 * 
		 * Resumindo os Wrappers são uma versao orietada a objeto dos tipos primitivos.
		 */
		
		// Tipos primitivos numericos
		Byte b = 100;
		Short s = 1000;
		Integer i = 1000; //Integer.parseInt(entrada.next()
		Long l = 100000L;
		Float f = 123.10F;
		Double d = 1234.5678;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i);
		System.out.println(l / 3);
		System.out.println(f);
		System.out.println(d);
		
		entrada.close();
		
		// Tipo primitivo Boolean 
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		// Tipo primitivo Character
		Character c = '#';
		System.out.println(c.toString());
	}
	
}
