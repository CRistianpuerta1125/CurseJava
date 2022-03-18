package SentenciaDeControl;

public class IfandElse {
    public static void main(String[] args) {
        var condicion = true;

        if (condicion){
            System.out.println("Condicion verdadera");
        } else {
            System.out.println("Condicion falsa");
        }

        var numero = 2;
        var numeroTexto = "Numero desconocido";

        if (numero == 1){
            numeroTexto = "numero uno";
        }
        else if( numero == 2) {
            numeroTexto = "numero dos";
        }
        else if (numero == 3){
            numeroTexto = "numero tres";
        }
        else if (numero == 4){
            numeroTexto = "numero cuatro";
        }
        else {
            numeroTexto = "numero no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
