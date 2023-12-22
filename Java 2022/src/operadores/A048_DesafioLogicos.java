package operadores;

public class A048_DesafioLogicos {
    public static void main(String[] args) {
        boolean primeiroTrabaho = false;
        boolean segundoTrabalho = false;

        if (primeiroTrabaho == true && segundoTrabalho == true){
            System.out.println("Compra TV de 50 e toma sorvete");
        }else if (primeiroTrabaho == true || segundoTrabalho == true) {
            System.out.println("Compra TV de 35 e toma sorvete");
        }else {
            System.out.println("Não sairam para tomar sorvete");
        }
    }
}
