package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarroDeCompraTest {
    private CarroDeCompra carro;
    private Producto producto1;
    private Producto producto2;

    @BeforeEach
    void setUp() {
        carro = new CarroDeCompra();
        producto1 = new Producto("001", "Producto 1", "Descripción", 10.0);
        producto2 = new Producto("002", "Producto 2", "Descripción", 20.0);
    }

    @Test
    @DisplayName("Agregar productos al carrito de compras")
    void agregarItem() {
        carro.agregarItem(producto1);
        assertEquals(1, carro.obtenerCantidadDeItems());
    }

    @Test
    @DisplayName("eliminar productos del carrito de compras")
    void removerItem() {
        carro.agregarItem(producto1);
        carro.removerItem(producto1);
        assertEquals(0, carro.obtenerCantidadDeItems());
    }

    @Test
    @DisplayName("obtener el precio total de los productos")
    void obtenerTotal() {
        carro.agregarItem(producto1);
        carro.agregarItem(producto2);
        assertEquals(30.0, carro.obtenerTotal());
    }

    @Test
    @DisplayName("vaciar el carrito de compras")
    void vaciar() {
        carro.agregarItem(producto1);
        carro.vaciar();
        assertEquals(0, carro.obtenerCantidadDeItems());
    }
}
