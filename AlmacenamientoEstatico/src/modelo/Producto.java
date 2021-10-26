package modelo;

public class Producto {
    private int codigo;
    private String nombre;
    private String tipo;
    private double precio;

    public Producto(){};

    public  Producto (int codigo, String nombre, String tipo, double precio) {
        this.codigo=codigo;
        this.nombre=nombre;
        this.tipo=tipo;
        this.precio=precio;
    }

    public int getCodigo() {return codigo;}
    public String getNombre() {return nombre;}
    public String getTipo() {return tipo;}
    public double getPrecio() {return precio;}

    public void setCodigo(int codigo) {this.codigo = codigo;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setTipo(String tipo) {this.tipo = tipo;}
    public void setPrecio(double precio) {this.precio = precio;}

    @Override // polimorfismo
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                '}';
    }

}
