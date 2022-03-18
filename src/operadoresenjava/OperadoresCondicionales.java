package operadoresenjava;

public class OperadoresCondicionales {
    public static void main(String[] args) {
        var a = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;

        var resultado = a>= 0 && a<= 10;
        if (resultado){
            System.out.println("Dentro de rango");
        }
        else {
            System.out.println("Fuera de rango");
        }

        var vacaciones = false;
        var diaDescanso = false;

        if (vacaciones || diaDescanso){
            System.out.println("Padre puede asistir al juego de su hijo");
        }
        else {
            System.out.println("El padre esta ocupado");
        }

    }
}
