package fundamento.operadores;

public class A045_ResolucaoDeDesafioAritmetica {
    public static void main(String[] args) {

    double numA = Math.pow((6 * (3 + 2)), 2);
    int denA = 3 * 2;
    double superiorA = numA / denA;

    double numB = (1-5)*(2-7);
    int denB = 2;
    double superiorB = Math.pow(numB / denB, 2);

    double superior = Math.pow(superiorA - superiorB, 3);

    double inferior = Math.pow(10,3);

    int resultado = (int) superior / (int) inferior;

    System.out.println(resultado);

    }
}
