import java.util.Scanner;

public class Problema1_ProductoEjecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean op = true;
        while (op) {
            System.out.println("Ingrese el nombre, cantidad y precio unitario del producto");
            Problema1_Producto producto1 = new Problema1_Producto(sc.next(), sc.nextInt(), sc.nextDouble());
            producto1.calcularPrecioFinal();
            producto1.calcularDescuento();
            System.out.println(producto1);
            System.out.println("Desea ingresar mas productos? 1.SI  |   2. NO");    
            op = sc.nextInt() == 1;
        }
        sc.close();
    }
}
