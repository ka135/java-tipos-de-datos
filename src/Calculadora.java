import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        // Lectura del valor de 2 variables enteras por consola:
        System.out.println("Ingrese el número 1");
        int numero1 = lector.nextInt();
        System.out.println("Ingrese el número 2");
        int numero2 = lector.nextInt();
        System.out.println("Ingrese la operación (+, -, *, /, %, ^)");
        char operacion = lector.next().charAt(0);

        switch (operacion) {
            case '+':
                // Operación suma:
                int suma = numero1 + numero2;
                System.out.println("La suma es " + suma);
                break;
            case '-':
                // Operación resta:
                int resta = numero1 - numero2;
                System.out.println("La resta es " + resta);
                break;
            case '*':
                // Operación multiplicación:
                int multiplicacion = numero1 * numero2;
                System.out.println("La multiplicación es " + multiplicacion);
                break;
            case '/':
                // Operación división:
                /* Es necesario que uno de los números que intervienen en la división sea double
                para que el resultado decimal sea aproximado correctamente. **/
                double division = (double) numero1 / numero2;
                System.out.println("La división es " + division);
                break;
            case '%':
                // Operación residuo división:
                double residuo = (double) numero1 % numero2;
                System.out.println("El residuo división es " + residuo);
                break;
            case '^':
                // Operación potencia:
                double potencia = pot(numero1, numero2);
                System.out.println("La división es " + potencia );
                break;
            default:
                System.out.println("Operación inválida");
        }
}

    private static double pot(int numero1, int numero2) {
        float res=1;
        for(int i=1;i<=numero2;i++)
            res*=numero1;
        return res;
    }
    }
