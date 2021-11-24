package demo.junit;

public class main {
    public static void main(String[] args){

        Marca marca1 = new Marca(1231, "Nike");
        Rubro rubro1 = new Rubro(1321,"calzado");
        Producto producto1 = new Producto(1321,"zapatillas",2500,0.2,marca1,rubro1);

        Existencia existencia = new Existencia(producto1,Color.Amarillo,Talle.M,100);


        System.out.println(existencia);

    }
}
