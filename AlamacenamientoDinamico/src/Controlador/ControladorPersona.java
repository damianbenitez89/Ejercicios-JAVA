package Controlador;

import Modelo.Persona;

import java.util.ArrayList;
import java.util.List;
//arrayList<Clase>
//CRUD--> interfaces que implican metodos de fabrica
//add(ojeto)-->C // get(i)--> R // set(i,objeto)-->U // DELETE (i)-->D // Size()-->para ver la dimension


public class ControladorPersona {
    List<Persona> lista = new ArrayList<>();

    public ControladorPersona() {  }

    public boolean agregarPersonaLista(Persona persona){
        lista.add(persona);
        return true;
    }

    public boolean modificarPersonaLista(Persona persona, int pos){
        lista.set(pos, persona);
        return true;
    }

    public boolean eliminarPersonaLista(int id){
        lista.remove(id);
        return true;
    }

    public int buscarPersonaLista(String id){
        int pos=-1;// posicion fuera de la lista
        for (int i = 0;i<lista.size();i++){
            if(lista.get(i).getId().equals(id)){
                pos=i;
            }
        }
        return pos;
    }

    //pedir un registro

    public Persona editaPersona(int pos){
        Persona pers = new Persona();
        pers.setId(lista.get(pos).getId());
        pers.setNombre(lista.get(pos).getNombre());
        pers.setApel(lista.get(pos).getApel());
        pers.setTel(lista.get(pos).getTel());
        pers.setCuenta(lista.get(pos).getCuenta());

        return pers;
    }

    public List<Persona> getLista(){
        return lista;
    }

}
