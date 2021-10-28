package Controlador;
import Modelo.Persona;
import java.util.*;//List/ArrayList
//ArrayList<Clase> CRUD, Sort, Dimensionar->Controlado por interfaces propias implementadas en sus librerias
//CRUD->Interfaces implican metodos de fabrica.
//add(obj)->C//get(i)->R//set(i,obj)->U//remove(i)->->//size()-->sort()
public class ControlPersona {
    List<Persona>  lista=new ArrayList<>();

    public ControlPersona() {  }

    public boolean agregarPersonaLista(Persona persona)//C
    {   lista.add(persona);
        return true;
    }

    public boolean modificarPersonaLista(Persona persona, int pos)//U
    {   lista.set(pos, persona);
        return true;
    }

    public boolean eliminarPersonaLista(int pos)//D
    {   lista.remove(pos);
        return true;
    }

    public int buscarPersonaLista(String id)//R
    {   int pos=-1;//Fuera de la Lista
        for (int i=0; i<lista.size();i++) {
            if (lista.get(i).getId().equals(id))//numericos con ==
            {
                pos = i;
            }
        }
        return pos;
    }

    //Pedir registro
    public Persona editarPersona(int pos)
    {   Persona pers=new Persona();//se acaba de crear
        pers.setId(lista.get(pos).getId());//elemento virtual desconocido pers--->lista
        pers.setNombre(lista.get(pos).getNombre());
        pers.setApel(lista.get(pos).getApel());
        pers.setFono(lista.get(pos).getFono());
        pers.setCuenta(lista.get(pos).getCuenta());
        return pers;
    }

    public List<Persona> getLista() {
        return lista;
    }
}
