package demo.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestExample {

    @Test
    public void pruebaNetoGravado() {

        //Configuracion
        Producto producto = new Producto();


        //Ejecucion
        producto.calcularNetoGravado(3000, 0.2);

        //Validacion
        assertEquals(3600, producto.netoGravado);


    }

    @Test
    public void pruebaPrecioVenta(){

        //Configuracion
        Producto producto = new Producto();

        //Ejecucion
        producto.calcularPrecioVenta(3600, 756);

        //Validacion
        assertEquals(4356, producto.precioVenta);

    }


    @Test
    public void pruebaIVA(){

        //Configuracion
        Producto producto = new Producto();

        //Ejecucion
        producto.calcularIva(3600);

        //Validacion
        assertEquals(756, producto.iva);
    }

    @Test
    public void pruebaIncrementoStock(){

        //Configuracion
        Existencia existencia = new Existencia();

        //Ejecucion
        existencia.incrementarStock(3);

        //Validacion
        assertEquals(3, existencia.cantidad);
    }

    @Test
    public void pruebaDecrementoStock(){

        //Configuracion
        Existencia existencia = new Existencia();

        //Ejecucion
        existencia.incrementarStock(5);

        existencia.decrementarStock(3);

        //Validacion
        assertEquals(2, existencia.cantidad);
    }

}
