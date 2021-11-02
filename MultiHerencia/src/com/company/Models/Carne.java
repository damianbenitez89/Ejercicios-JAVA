package com.company.Models;

public class Carne extends Producto{
    private String procedencia; // importado o nacional
    private String tipo;

    public Carne() {
    }

    public Carne(String codigo, String nombre, String empresa, String stock, String procedencia, String tipo) {
        super(codigo, nombre, empresa, stock);
        this.procedencia = procedencia;
        this.tipo = tipo;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+" "+"Carne{" +
                "procedencia='" + procedencia + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
