package demo.junit;

public class Existencia {
    Producto producto;
    Color color;
    Talle talle;
    int cantidad;

    public Existencia(Producto producto, Color color, Talle talle, int cantidad) {
        this.producto = producto;
        this.color = color;
        this.talle = talle;
        this.cantidad = cantidad;
    }

    public Existencia() {
    }

    public void incrementarStock(int cantidad){
        this.cantidad = this.cantidad + cantidad;

    }

    public void decrementarStock(int cantidad){
        this.cantidad = this.cantidad - cantidad;

    }






    @Override
    public String toString() {
        return "Existencia{" +
                "producto=" + producto +
                ", color=" + color +
                ", talle=" + talle +
                ", cantidad=" + cantidad +
                '}';
    }
}
