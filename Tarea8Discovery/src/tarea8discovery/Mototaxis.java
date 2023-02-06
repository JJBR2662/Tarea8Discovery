package tarea8discovery;

import java.awt.Color;
import java.util.ArrayList;

public class Mototaxis extends Transportes{
    private ArrayList<Alumnos> lista = new ArrayList();

    public Mototaxis() {
    }

    public Mototaxis(String placa, Color color, Transportistas transportista) {
        super(placa, color, transportista);
    }

    public ArrayList<Alumnos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Alumnos> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return super.toString()+" Mototaxis{" + "lista=" + lista + '}';
    }

    
    
}
