
package javaapplication104;
import java.util.Scanner;

public class Problema2_EmpleadoEjecutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Problema2_Empleado empleado1[] = new Problema2_Empleado[100];        
        boolean opc = true;
        String resp = null;
        double aumSalario;
        int numEmpleados = 0;
        System.out.println("Ingrese un aumento salarial");
        aumSalario = scanner.nextDouble(); 
        while (opc) {
            System.out.print("Ingrese el nombre, el salario y la edad: ");
            empleado1[numEmpleados] = new Problema2_Empleado(scanner.next(), scanner.nextDouble(), scanner.nextInt());
            numEmpleados += 1;
            empleado1[numEmpleados-1].aumentoSalario(empleado1, numEmpleados);
            empleado1[numEmpleados-1].aumentoSalarioEmpleado(empleado1, aumSalario);
            System.out.print("Desea agregar mas empleados? (S/N): ");
            resp = scanner.next();
            if (resp.equals("N")) break;
        }
        
        System.out.println("Información de los empleados:");
        for (int i = 0; i < numEmpleados; i++) {
            System.out.println(empleado1[i]);
        }
    }
}
