package operadoresenjava;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int a=3, b=2; // restrincion de utilizar var es que la variables tienen que ser separadas
        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);
        
        resultado = a - b;
        System.out.println("resultado resta = " + resultado);

        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);

        var resultado2 = 3.0 / b;
        System.out.println("resultado2 division= " + resultado2);

        resultado = a % b;
        System.out.println("resultado modulo = " + resultado);

        if (b % 2 == 0)
            System.out.println("Es un numero par");
        else
            System.out.println("Es numero impar");
    }
}
