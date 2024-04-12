import java.util.Scanner;


public class prueba {

    public static void main(String[] args) {
        int salir = 10;
        while (salir != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Seleccione la opcion que quiera hacer en la calculadora \n\n\n1.Sumar\n2.Restar\n3.multiplicar\n4.dividir\n0.salir");
            int input = scanner.nextInt();
            if (input == 1) {
                System.out.println("ingrese el primer numero: ");
                int n1 = scanner.nextInt();
                System.out.println("ingrese el segundo numero: ");
                int n2 = scanner.nextInt();
                int r = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " + r);
            }
            if (input == 2) {
                System.out.println("ingrese el primer numero: ");
                int n1 = scanner.nextInt();
                System.out.println("ingrese el segundo numero: ");
                int n2 = scanner.nextInt();
                int r = n1 - n2;
                System.out.println(n1 + " - " + n2 + " = " + r);
            }
            if (input == 3) {
                System.out.println("ingrese el primer numero: ");
                int n1 = scanner.nextInt();
                System.out.println("ingrese el segundo numero: ");
                int n2 = scanner.nextInt();
                int r = n1 * n2;
                System.out.println(n1 + " x " + n2 + " = " + r);
            }
            if (input == 4) {
                System.out.println("ingrese el primer numero: ");
                int n1 = scanner.nextInt();
                System.out.println("ingrese el segundo numero: ");
                int n2 = scanner.nextInt();
                int r = n1 / n2;
                System.out.println(n1 + " / " + n2 + " = " + r);
            }
            if (input == 0) {
                break;
            }
        }

    }
}