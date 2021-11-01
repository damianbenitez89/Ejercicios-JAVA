package Controlador;

import Models.Enfermera;
import Models.Especialista;
import Models.Funcionario;
import Models.Medico;

import java.util.ArrayList;
import java.util.List;

public class TFuncionario {
    List<Funcionario> lista = new ArrayList<>();

    public TFuncionario() { }

    public boolean ingresarFuncionario (Funcionario funcionario){

        lista.add(funcionario);
        return true;
    }

    public boolean modificarFuncionario (Funcionario funcionario, int pos){

        lista.set(pos,funcionario);
        return true;
    }

    public boolean eliminaFuncionario ( int pos){
        lista.remove(pos);
        return true;
    }

    public int buscanFuncionario(String id){
        int pos=-1;

        for(int i=0; i<lista.size();i++){
            if(lista.get(i).getId().equals("id")){
                pos=i;
            }
        }

        return pos;
    }

    //retrono de datos utilizados de un vector

    public String[] editarFuncionario (int pos){
        String[]  vector= new String[6];
        vector[0]=lista.get(pos).getId();
        vector[1]=lista.get(pos).getNombre();
        vector[2]=lista.get(pos).getApellido();
        vector[3]=lista.get(pos).getSueldo();
        if((Funcionario)lista.get(pos) instanceof Medico){
            vector[4]=(((Medico) lista.get(pos)).getCodigo());
            vector[5]="1";
        }
        if((Funcionario)lista.get(pos) instanceof Especialista){
            vector[4]=(((Especialista) lista.get(pos)).getCodigo());
            vector[5]=(((Especialista) lista.get(pos)).getEspec());
        }
        if((Funcionario)lista.get(pos) instanceof Enfermera){
            vector[4]=(((Enfermera) lista.get(pos)).getTurno());
            vector[5]="2";
        }

        return vector;
    }

    public List<Funcionario> getLista() {
        return lista;
    }

    public void setLista(List<Funcionario> lista) {
        this.lista = lista;
    }
}
