import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        /*
        Realiza una aplicación que nos pida un número de ventas a introducir,
        después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado.
        Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero de ventas del día: ");
        int numVentas =sc.nextInt();
        double totalVentas=0;
        for(int i=1;i<=numVentas;i++){
            System.out.println("Venta N° "+i);
            System.out.println("Ingresa el monto de la venta: ");
            double venta = sc.nextDouble();
            totalVentas=totalVentas+venta;
        }
        System.out.println("Ventas totales del día: "+numVentas);
        System.out.println("Total venta del día es: s/."+totalVentas);
    }
}