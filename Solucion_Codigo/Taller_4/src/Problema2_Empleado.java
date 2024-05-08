public class Problema2_Empleado {
    private String nombre;
    private double salario;
    private int edad;
    
    public Problema2_Empleado(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", edad=" + edad +
                '}';
    }

    public double getSalario(){
        return this.salario;
    }
    public void setSalaro(double sal){
        this.salario=sal;
    }
}
