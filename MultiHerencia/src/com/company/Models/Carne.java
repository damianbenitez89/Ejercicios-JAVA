package com.company.Models;

public class Carne extends Producto{
    private String procedencia; // importado o nacional
    private String tipo;

    public Carne() {
    }

    public Carne(String codigo, String nombre, int precio, int stock, String procedencia, String tipo) {
        super(codigo, nombre, precio, stock);
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

    @Override
    public int totalAPagar(int cant) {
        double dif=0.0, imp=0.0;
        int total=0;
        imp=getPrecio()*cant*IVA;
        if(getProcedencia().equals("importado")) {
            dif=getPrecio()*cant*CIF;
            total = getPrecio()*cant+(int)(dif+imp);
        }
        else{
            total=getPrecio()*cant+(int)(imp);
        }

        return total;
    }
}
