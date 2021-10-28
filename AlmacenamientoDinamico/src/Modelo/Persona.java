package Modelo;

public class Persona {
    private String id;
    private String nombre;
    private String apel;
    private String fono;
    private Cuenta cuenta;//Encapsulamierto de cuenta-> Modelo de Colaboracion

    public Persona() {    }

    public Persona(String id, String nombre, String apel, String fono) {
        this.id = id;
        this.nombre = nombre;
        this.apel = apel;
        this.fono = fono;
    }

    public Persona(String id, String nombre, String apel, String fono, Cuenta cuenta) {
        this.id = id;
        this.nombre = nombre;
        this.apel = apel;
        this.fono = fono;
        this.cuenta = cuenta;
    }

    public String getId()               {  return id;   }
    public void setId(String id)        {  this.id = id;  }

    public String getNombre()            { return nombre;    }
    public void setNombre(String nombre) { this.nombre = nombre;    }

    public String getApel()              { return apel;    }
    public void setApel(String apel)     { this.apel = apel;    }

    public String getFono()              { return fono;    }
    public void setFono(String fono)     { this.fono = fono;    }

    public Cuenta getCuenta()            {  return cuenta;    }
    public void setCuenta(Cuenta cuenta) {  this.cuenta = cuenta;    }

    @Override
    public String toString() {
        return "Persona{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apel='" + apel + '\'' +
                ", fono='" + fono + '\'' +
                '}';
    }
}
