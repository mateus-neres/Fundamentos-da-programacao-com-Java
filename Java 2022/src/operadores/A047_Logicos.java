package operadores;

public class A047_Logicos {

    public static void main(String[] args) {

    	boolean condicao1 = true;
    	boolean condicao2 = false;
    	
    	System.out.println(condicao1 && condicao2);
    	System.out.println(condicao1 || condicao2);
    	System.out.println(condicao1 ^ condicao2);
    	System.out.println(!condicao1);
    	System.out.println(!condicao2);
    	
    	System.out.println("\nTabela verdade E (AND)");
    	System.out.println(true && true);
    	System.out.println(true && false);
//    	System.out.println(false && true);
//  	System.out.println(false && false);
    	    	
    	System.out.println("\nTabela verdade OU (OR)");
//    	System.out.println(true || true);
//    	System.out.println(true || false);
    	System.out.println(false || true);
    	System.out.println(false || false);
    	
    	System.out.println("\nTabela verdade OU exclusivo (XOR)");
    	System.out.println(true ^ true);
    	System.out.println(true ^ false);
    	System.out.println(false ^ true);
    	System.out.println(false ^ false);
    	
    	System.out.println("\nTabela verdade NEGAÇÃo (NOT) ");
    	System.out.println(!true);
    	System.out.println(!false);
    	
    	
    }
}
