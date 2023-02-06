package tarea8discovery;

import java.awt.Color;
import java.util.ArrayList;

public class Taxis extends Transportes{
    
    private ArrayList<Alumnos> lista = new ArrayList();
    private int numtaxi;

    public Taxis() {
    }

    public Taxis(int numtaxi, String placa, Color color, Transportistas transportista) {
        super(placa, color, transportista);
        this.numtaxi = numtaxi;
    }

    public ArrayList<Alumnos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Alumnos> lista) {
        this.lista = lista;
    }

    public int getNumtaxi() {
        return numtaxi;
    }

    public void setNumtaxi(int numtaxi) {
        this.numtaxi = numtaxi;
    }

    @Override
    public String toString() {
        return super.toString()+" Taxis{" + "lista=" + lista + ", numtaxi=" + numtaxi + '}';
    }
    
    
}
