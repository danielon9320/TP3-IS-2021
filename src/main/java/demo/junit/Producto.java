package demo.junit;

public class Producto {
    int codigo;
    String descripcion;
    double costo;
    double netoGravado;
    double iva;
    double precioVenta;
    double margenGanacia;
    Marca marca;
    Rubro rubro;

    public Producto(int codigo, String descripcion, float costo, double margenGanacia, Marca marca, Rubro rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.costo = costo;
        calcularNetoGravado(costo, margenGanacia);
        calcularIva(netoGravado);
        calcularPrecioVenta(netoGravado, iva);
        this.margenGanacia = margenGanacia;
        this.marca = marca;
        this.rubro = rubro;


    }

    public Producto() {
    }

    public void calcularNetoGravado(float costo, double margenGanacia){
        this.netoGravado = costo + costo * margenGanacia;

    }


    public void calcularPrecioVenta(double netoGravado, double iva){
        this.precioVenta = netoGravado + iva;


    }

    public void calcularIva(double netoGravado){
        this.iva = netoGravado * 0.21;
    }



    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", descripcion='" + descripcion + '\'' +
                ", costo=" + costo +
                ", netoGravado=" + netoGravado +
                ", iva=" + iva +
                ", precioVenta=" + precioVenta +
                ", margenGanacia=" + margenGanacia +
                ", marca=" + marca +
                ", rubro=" + rubro +
                '}';
    }
}
