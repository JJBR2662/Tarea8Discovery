package tarea8discovery;

import java.awt.Color;
import java.util.ArrayList;

public class Rapiditos extends Transportes{
    
    private int numsillas;
    private ArrayList<Alumnos> lista = new ArrayList();

    public Rapiditos() {
    }

    public Rapiditos(int numsillas, String placa, Color color, Transportistas transportista) {
        super(placa, color, transportista);
        this.numsillas = numsillas;
    }

    public int getNumsillas() {
        return numsillas;
    }

    public void setNumsillas(int numsillas) {
        this.numsillas = numsillas;
    }

    public ArrayList<Alumnos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Alumnos> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return  super.toString()+" Rapiditos{" + "numsillas=" + numsillas + ", lista=" + lista + '}';
    }
    
    
}
