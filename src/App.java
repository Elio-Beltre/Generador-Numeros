import java.util.Scanner;

public class App {
    public static int obtenerEntrada(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor ");
        int valor = scanner.nextInt();
        return valor;
    }

    public static void generarValores(){
        int n = obtenerEntrada();
        int conteo = 0;
        while (conteo < n){
            conteo = conteo + 1;
            System.out.println(conteo);
        }
    }
    public static void generarValoresPares(){
        int n = obtenerEntrada();
        for (int contador = 0; contador <=n; contador++){
            if (contador % 2 == 0) System.out.println(contador+ " ");
        }

    }
    public static void generarRandom(){
        int n = (int) (Math.random() * 3500);
        int contador = 0;
        while (contador < n){
            contador = contador + 5;
            System.out.println(contador);
        }
    }

    public static void main(String[] args) {
        generarRandom();
    }


}

