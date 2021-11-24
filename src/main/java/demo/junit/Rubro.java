package demo.junit;

public class Rubro {
    int id;
    String nombre;

    public Rubro(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Rubro{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
