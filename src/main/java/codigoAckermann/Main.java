package codigoAckermann;
import java.util.Scanner;

/**
 *
 * @author Max Rojas Rojas
 */

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Contador contador = new Contador();

        System.out.println("\t\t\t BIENVENIDO " );
        System.out.println("Sea A(m,n), la representacion de la funcion de Ackermann" );
        System.out.println("Introduzca los valores para m y n, se recomienda:");
        System.out.println("\t-Valores entre 0-3 para m.");
        System.out.println("\t-Valores entre 0-10 para n.");
        
        System.out.print("Ingrese m: ");
        int m = sc.nextInt();

        System.out.print("Ingrese n: ");
        int n = sc.nextInt();

        if (m < 0 || n < 0) {
        System.out.println("Solo se permiten valores enteros no negativos.");
        return;
        }

        if (m >= 4 || (m == 3 && n > 10)) {
        System.out.println("!!!!!!! ADVERTENCIA: ");
        System.out.println("\t El calculo puede consumir demasiada memoria y demorar mucho. Esto sucede cuando es mayor a 4 y/o n mayor a 10");
        }

        long inicio = System.currentTimeMillis();
        int resultado = Ackermann.ackermannIter(m, n, contador);
        long fin = System.currentTimeMillis();

        
        System.out.println("Resultado A("+m+","+n+"):\t" + resultado);
        System.out.println("Pasos realizados:\t" + contador.getPasos());
        System.out.println("Tiempo de ejecucion:\t" + (fin - inicio) + " ms");
        System.out.println("Notacion asintotica:\t " + Ackermann.obtenerComplejidad(m));
    }

}

