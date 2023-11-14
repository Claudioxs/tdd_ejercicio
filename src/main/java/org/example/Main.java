package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarroDeCompra carro = new CarroDeCompra();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n------ Menú del Carrito de Compras ------");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Remover Producto");
            System.out.println("3. Ver Total de la Compra");
            System.out.println("4. Ver Cantidad de Productos");
            System.out.println("5. Vaciar Carrito");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el código del producto: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Ingrese el título del producto: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese la descripción del producto: ");
                    String descripcion = scanner.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = scanner.nextDouble();

                    Producto nuevoProducto = new Producto(codigo, titulo, descripcion, precio);
                    carro.agregarItem(nuevoProducto);
                    System.out.println("Producto agregado al carrito.");
                    break;

                case 2:
                    if (carro.obtenerCantidadDeItems() > 0) {
                        System.out.print("Ingrese el código del producto a remover: ");
                        String codigoRemover = scanner.nextLine();
                        Producto productoARemover = new Producto(codigoRemover, "", "", 0.0);
                        carro.removerItem(productoARemover);
                        System.out.println("Producto removido del carrito.");
                    } else {
                        System.out.println("El carrito está vacío. No hay productos para remover.");
                    }
                    break;

                case 3:
                    System.out.println("Total de la compra: $" + carro.obtenerTotal());
                    break;

                case 4:
                    System.out.println("Cantidad de productos en el carrito: " + carro.obtenerCantidadDeItems());
                    break;

                case 5:
                    carro.vaciar();
                    System.out.println("Carrito vaciado.");
                    break;

                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }

        } while (opcion != 0);

        scanner.close();
    }
}