package fundamento;

public class A034_ConversaoDeTiposPrimitivos01 {

	public static void main(String[] args) {
		
		/*
		 * O java realiza conversão inplicita de Tipos Primitivos menores ara os maiores.
		 * Ex: Byte -- >> Short -->> Int -->> Long 
		 * 
		 *Porém o inverso é realizado de forma explicita.
		 *Ex: Byte <<-- Short <<-- Int <<-- Long
		 *
		 *
		 *Tome como base a o exemplo abaixo:
		 *
		 *Int -->> Float
		 *3 -->> 3.0
		 *Não há perdas pois os número inteiro 3, apenas ganhou uma casa decimal, isso foi uma conversão implicita.
		 * 
		 *Float -->> Int
		 *3.2 -->> 3
		 *Há uma perda, pois o número com ponto flutuante perdeu sua casa decimal, isso foi uma conversão implicita.
		 *
		 *Resumindo, o java converte automatico se você sair de um tipo primitivo menor para um tipo primitivo maio, caso contrario tem que haver uma conversão explicita.
		 *
		 *Obs: O java não analisa valores e sim o tipo atribuido.
		 */
		
	}
	
}
