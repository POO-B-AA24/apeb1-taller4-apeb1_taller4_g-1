
package javaapplication104;
class Problema2_Empleado {
        public String nombre;
        public double salario;
        public int edad;
        public double promedio;
        public double aumentoSalarioEmpleado;
        public Problema2_Empleado(String nombre, double salario, int edad) {
            this.nombre = nombre;
            this.salario = salario;
            this.edad = edad;
        }
    public void aumentoSalario(Problema2_Empleado empleado1[], int n){
        this.promedio = salario/n;
    }
    public void aumentoSalarioEmpleado(Problema2_Empleado empleado1[], double aumSalario){
        this.aumentoSalarioEmpleado= (this.salario<this.promedio)? this.salario * aumSalario: this.salario;
    }
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", salario=" + salario + ", edad=" + edad + ", promedio=" + promedio + ", aumentoSalarioEmpleado=" + aumentoSalarioEmpleado + '}';
    }
    
    
}
