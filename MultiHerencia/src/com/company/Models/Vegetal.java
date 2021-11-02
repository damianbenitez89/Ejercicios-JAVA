package com.company.Models;

public class Vegetal extends Producto{

    private String tipoveg;//Organico o normal
    private String genero; // fruta verdura u hongo

    public Vegetal() {

    }

    public Vegetal(String codigo, String nombre, String empresa, String stock, String tipoveg, String genero) {
        super(codigo, nombre, empresa, stock);
        this.tipoveg = tipoveg;
        this.genero = genero;
    }

    public String getTipoveg() {
        return tipoveg;
    }

    public void setTipoveg(String tipoveg) {
        this.tipoveg = tipoveg;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString()+" "+"Vegetal{" +
                "tipoveg='" + tipoveg + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }


}
