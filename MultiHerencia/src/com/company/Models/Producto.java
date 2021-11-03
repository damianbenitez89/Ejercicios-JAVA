package com.company.Models;

import com.company.Servicio.Parametrizable;
//abstract para multiHerencia
public abstract class Producto implements Parametrizable {
    private String codigo;
    private String nombre;
    private int precio;
    private int stock;

    public Producto() {
    }

    public Producto(String codigo, String nombre, int precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio='" + precio + '\'' +
                ", stock='" + stock + '\'' +
                '}';
    }

    //declarar componente abstracto > a travez de un metodo >

    public abstract  int totalAPagar(int cant);

    @Override
    public boolean verificarExistencia(int cant) {

        boolean existe = false;
        if(stock>=cant){
            existe=true;
        }

        return existe;
    }

    @Override
    public void actualizarStock(int cant) {

        stock=stock-cant;

    }
}
