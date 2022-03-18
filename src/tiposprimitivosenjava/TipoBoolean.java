package tiposprimitivosenjava;

public class TipoBoolean {
    public static void main(String[] args) {
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);

        if (varBoolean) {
            System.out.println("La bandera es Verdadera");
        }
        else {
            System.out.println("La bandera es falsa");
        }

        var edad = 10;
        var esAdulto = edad >= 18;// esta parte edad >= 18 se puede poner en el if para ahorrar codigo
        if (esAdulto){
            System.out.println(" Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }
    }
}
