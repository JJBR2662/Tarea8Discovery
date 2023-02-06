package tarea8discovery;

import java.util.ArrayList;
import java.util.Date;

public class Alumnos extends Persona{
    
    private int id;//unico
    private ArrayList<Clases> clases = new ArrayList();

    public Alumnos() {
    }
    

    public Alumnos(int id, String nombre, int identidad, Date nacimiento) {
        super(nombre, identidad, nacimiento);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Clases> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clases> clases) {
        this.clases = clases;
    }
    
    public boolean idunico(ArrayList<Alumnos> lista, int id){
        boolean seraunico;
        int cont=0;
        for (Alumnos a : lista) {
            if (id==a.getId()) {
                cont++;
            }
        }
        if (cont>0) {
            seraunico=false;
        }else{
            seraunico=true;
        }
        return seraunico;
    }

    @Override
    public String toString() {
        return super.toString()+" Alumnos{" + "id=" + id + ", clases=" + clases + '}';
    }
    
    
}
