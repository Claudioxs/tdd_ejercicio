package org.example;


import java.util.ArrayList;
import java.util.List;

public class CarroDeCompra {
    private List<Producto> items;

    public CarroDeCompra() {
        this.items = new ArrayList<>();
    }

    public void agregarItem(Producto producto) {
        items.add(producto);
    }

    public void removerItem(Producto producto) {
        items.remove(producto);
    }

    public double obtenerTotal() {
        double total = 0.0;
        for (Producto producto : items) {
            total += producto.getPrecio();
        }
        return total;
    }

    public int obtenerCantidadDeItems() {
        return items.size();
    }

    public void vaciar() {
        items.clear();
    }
}

