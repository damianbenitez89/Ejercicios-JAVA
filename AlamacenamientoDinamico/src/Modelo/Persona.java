package Modelo;

public class Persona {
    private String id;
    private String nombre;
    private String apel;
    private String tel;
    Cuenta cuenta;//encapsulamiento de cuenta-> modelo de colaboracion

    public Persona() { }

    public Persona(String id, String nombre, String apel, String tel) {
        this.id = id;
        this.nombre = nombre;
        this.apel = apel;
        this.tel = tel;
    }

    public Persona(String id, String nombre, String apel, String tel, Cuenta cuenta) {
        this.id = id;
        this.nombre = nombre;
        this.apel = apel;
        this.tel = tel;
        this.cuenta = cuenta;
    }

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApel() {return apel;}
    public void setApel(String apel) {this.apel = apel;}

    public String getTel() {return tel;}
    public void setTel(String tel) {this.tel = tel;}

    public Cuenta getCuenta() {return cuenta;}
    public void setCuenta(Cuenta cuenta) {this.cuenta = cuenta;}

    @Override
    public String toString() {
        return "Persona{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apel='" + apel + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
