import java.util.ArrayList;
import java.util.Scanner;

public class Problema2_EmpleadoEjecutor {
    public static void main(String[] args) {
        double porcentajeAumento = 0.1;
        boolean op = false;
        Scanner sc = new Scanner(System.in);
        double promedio = 0;
        ArrayList<Problema2_Empleado> empleados = new ArrayList<>();
        do {
            System.out.println("Ingrese el nombre, salario y edad del empleado");
            Problema2_Empleado empleado = new Problema2_Empleado(sc.next(), sc.nextDouble(), sc.nextInt());
            empleados.add(empleado);
            System.out.println("Desea ingresar mas empleados? 1.SI  |   2. NO");
            op = sc.nextInt() == 1;
        } while (op);
        promedio = calcularPromedio(empleados, promedio);
        calcularAumentoSalarial(promedio, empleados, porcentajeAumento);

        for (Problema2_Empleado empleado : empleados) {
            System.out.println(empleado);
        }

        sc.close();
    }

    public static double calcularPromedio(ArrayList<Problema2_Empleado> empleados, double promedio) {
        promedio = 0;
        for (Problema2_Empleado empleado : empleados) {
            promedio += empleado.getSalario();
        }
        promedio /= empleados.size();
        return promedio;
    }

    public static void calcularAumentoSalarial(double promedio, ArrayList<Problema2_Empleado> empleados,
            double porcentajeAumento) {
        for (Problema2_Empleado empleado : empleados) {
            double aux = 0;
            empleado.setSalaro(
                    aux += (empleado.getSalario() <= promedio) ? empleado.getSalario() * porcentajeAumento : 0);
        }

    }
}
