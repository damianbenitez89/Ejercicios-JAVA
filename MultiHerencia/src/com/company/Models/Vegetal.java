package com.company.Models;

public class Vegetal extends Producto{

    private String tipoveg;//Organico o normal
    private String genero; // fruta verdura u hongo

    public Vegetal() {

    }

    public Vegetal(String codigo, String nombre, int precio, int stock, String tipoveg, String genero) {
        super(codigo, nombre, precio, stock);
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

    @Override
    public int totalAPagar(int cant) {
        double dif=0.0, imp=0.0;
        int total=0;
        imp=getPrecio()*cant*IVA;
        if(getTipoveg().equals("organico")) {
            dif=getPrecio()*cant*0.1;
            total = getPrecio()*cant+(int)(dif+imp);
        }
        else{
            total=getPrecio()*cant+(int)(imp);
        }

        return total;
    }


}
