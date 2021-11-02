package com.company.Models;

import com.company.Servicio.Parametrizable;

public class Producto implements Parametrizable {
    private String codigo;
    private String nombre;
    private String empresa;
    private String stock;

    public Producto() {
    }

    public Producto(String codigo, String nombre, String empresa, String stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.empresa = empresa;
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

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", empresa='" + empresa + '\'' +
                ", stock='" + stock + '\'' +
                '}';
    }

    @Override
    public boolean verificarExistencia(int cant) {
        return false;
    }

    @Override
    public void actualizarStock(int cant) {

    }
}
