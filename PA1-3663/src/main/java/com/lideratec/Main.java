package com.lideratec;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Producto producto1 = null;
        Producto producto2 = null;
        Producto producto3 = null;


        int contadorProductos = 0;
        double acumuladorVentas = 0.0;
        int opcion;

        System.out.println("--- SISTEMA DE CONTROL DE MICROEMPRESA ---");

        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Registrar nuevo producto");
            System.out.println("2. Mostrar todos los productos");
            System.out.println("3. Realizar una venta");
            System.out.println("4. Ver ingresos totales acumulados");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    if (contadorProductos < 3) {
                        System.out.print("Ingrese código del producto: ");
                        String codigo = scanner.next();
                        System.out.print("Ingrese nombre (sin espacios): ");
                        String nombre = scanner.next();
                        System.out.print("Ingrese precio: ");
                        double precio = scanner.nextDouble();
                        System.out.print("Ingrese stock inicial: ");
                        int stock = scanner.nextInt();

                        if (contadorProductos == 0) {
                            producto1 = new Producto(codigo, nombre, precio, stock);
                        } else if (contadorProductos == 1) {
                            producto2 = new Producto(codigo, nombre, precio, stock);
                        } else if (contadorProductos == 2) {
                            producto3 = new Producto(codigo, nombre, precio, stock);
                        }

                        contadorProductos++;
                        System.out.println("¡Producto registrado con éxito!");
                    } else {
                        System.out.println("Capacidad máxima de productos (3) alcanzada.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- LISTA DE PRODUCTOS ---");
                    if (contadorProductos == 0) {
                        System.out.println("Aún no hay productos registrados.");
                    } else {
                        if (producto1 != null) producto1.mostrarInformacion();
                        if (producto2 != null) producto2.mostrarInformacion();
                        if (producto3 != null) producto3.mostrarInformacion();
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el código del producto a vender: ");
                    String codigoVenta = scanner.next();
                    System.out.print("Ingrese la cantidad a vender: ");
                    int cantidad = scanner.nextInt();

                    boolean seEncontro = false;


                    if (producto1 != null && producto1.codigo.equalsIgnoreCase(codigoVenta)) {
                        seEncontro = true;
                        if (producto1.vender(cantidad)) {
                            System.out.println("Venta exitosa de: " + producto1.nombre);
                            acumuladorVentas += (cantidad * producto1.precio);
                        } else {
                            System.out.println("Error: Stock insuficiente.");
                        }
                    } else if (producto2 != null && producto2.codigo.equalsIgnoreCase(codigoVenta)) {
                        seEncontro = true;
                        if (producto2.vender(cantidad)) {
                            System.out.println("Venta exitosa de: " + producto2.nombre);
                            acumuladorVentas += (cantidad * producto2.precio);
                        } else {
                            System.out.println("Error: Stock insuficiente.");
                        }
                    } else if (producto3 != null && producto3.codigo.equalsIgnoreCase(codigoVenta)) {
                        seEncontro = true;
                        if (producto3.vender(cantidad)) {
                            System.out.println("Venta exitosa de: " + producto3.nombre);
                            acumuladorVentas += (cantidad * producto3.precio);
                        } else {
                            System.out.println("Error: Stock insuficiente.");
                        }
                    }

                    if (!seEncontro) {
                        System.out.println("No se encontró ningún producto con ese código.");
                    }
                    break;

                case 4:
                    System.out.println("\nIngresos totales acumulados: S/" + acumuladorVentas);
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
