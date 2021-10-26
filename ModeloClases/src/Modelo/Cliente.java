package Modelo;


public class Cliente {

    private String name;
    private int age;
    private int sueldo;

    public Cliente(){}; //constructor sin parametros para declarar en el main con wl new


    public Cliente (String name, int age, int sueldo){ //ocupar la memoria con estos datos
        this.name=name;
        this.age=age;
        this.sueldo=sueldo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    //customise para dar un funcion con los datos directamente

    public void presentarDatosCliente (){

        System.out.println("LOS DATOS DEL CLIENTE SON : ");
        System.out.println("EL NOMBRE ES:"+name);
        System.out.println("LA EDAD ES  :"+age);
        System.out.println("EL SUELDO ES:"+sueldo);
    }
}
