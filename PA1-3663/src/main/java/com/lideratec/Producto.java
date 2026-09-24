package com.lideratec;

public class Producto {

    String codigo;
    String nombre;
    double precio;
    int stock;

    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrarInformacion() {
        System.out.println("Código: " + this.codigo + " | Producto: " + this.nombre + " | Precio: S/" + this.precio + " | Stock: " + this.stock);
    }

    public boolean vender(int cantidadVendida) {
        if (cantidadVendida > 0 && cantidadVendida <= this.stock) {
            this.stock = this.stock - cantidadVendida;
            return true;
        } else {
            return false;
        }
    }
}