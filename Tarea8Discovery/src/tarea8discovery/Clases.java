package tarea8discovery;

import java.util.ArrayList;

class Clases {
    
    private String nombre;
    private String codigoclase;//unico

    public Clases() {
    }

    public Clases(String nombre, String codigoclase) {
        this.nombre = nombre;
        this.codigoclase = codigoclase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoclase() {
        return codigoclase;
    }

    public void setCodigoclase(String codigoclase) {
        this.codigoclase = codigoclase;
    }
    
    public boolean codigounico(ArrayList<Clases> clases, String codigo){
        int cont=0;
        for (Clases c : clases) {
            if (codigo.equalsIgnoreCase(c.getCodigoclase())) {
                cont++;
            }
        }
        if (cont>0) {
            return false;
        }else{
            return true;
        }
    }

    @Override
    public String toString() {
        return "Clases{" + "nombre=" + nombre + ", codigoclase=" + codigoclase + '}';
    }
    
    
    
}
