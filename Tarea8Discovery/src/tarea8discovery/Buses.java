package tarea8discovery;

import java.awt.Color;
import java.util.ArrayList;

public class Buses extends Transportes{
    
    private ArrayList<Alumnos> lista  = new ArrayList();
    private int numsillas;
    private int numpersonasenpie;

    public Buses() {
    }

    public Buses(int numsillas, int numpersonasenpie, String placa, Color color, Transportistas transportista) {
        super(placa, color, transportista);
        this.numsillas = numsillas;
        this.numpersonasenpie = numpersonasenpie;
    }

    public ArrayList<Alumnos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Alumnos> lista) {
        this.lista = lista;
    }

    public int getNumsillas() {
        return numsillas;
    }

    public void setNumsillas(int numsillas) {
        this.numsillas = numsillas;
    }

    public int getNumpersonasenpie() {
        return numpersonasenpie;
    }

    public void setNumpersonasenpie(int numpersonasenpie) {
        this.numpersonasenpie = numpersonasenpie;
    }

    @Override
    public String toString() {
        return super.toString()+" Buses{" + "lista=" + lista + ", numsillas=" + numsillas + ", numpersonasenpie=" + numpersonasenpie + '}';
    }
    
    
}
