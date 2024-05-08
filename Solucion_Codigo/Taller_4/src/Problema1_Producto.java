public class Problema1_Producto {
    private String nombre;
    private int cantidad;
    private double precioUnitario;
    private double precioFinal;
    private double descuento;

    public Problema1_Producto(String nombre, int cantidad, double precioUnitario) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public String toString() {
        return "Producto{" + "nombre='" + nombre + ", cantidad=" + cantidad + ", precioUnitario="
                + precioUnitario + ", precioFinal=" + precioFinal + ", descuento=" + descuento + "% }";
    }

    public void calcularPrecioFinal() {
        if (this.precioUnitario >= 1000 && this.cantidad >= 10) {
            this.precioFinal = this.precioUnitario * this.cantidad * 0.9;
        } else {
            this.precioFinal = this.precioUnitario * this.cantidad * 0.95;
        }
    }

    public void calcularDescuento() {
        descuento = (this.precioUnitario >= 1000 && this.cantidad >= 10) ? 10 : 5;
    }

}