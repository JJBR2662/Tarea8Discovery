package tarea8discovery;

import java.util.ArrayList;
import java.util.Date;

public class Persona {
    protected String nombre;
    protected int identidad;//unico
    protected Date nacimiento;

    public Persona() {
    }
    
    

    public Persona(String nombre, int identidad, Date nacimiento) {
        this.nombre = nombre;
        this.identidad = identidad;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentidad() {
        return identidad;
    }

    public void setIdentidad(int identidad) {
        this.identidad = identidad;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
    
    public boolean identidadunica(ArrayList<Persona> lista, int identidad ){
        int cont=0;
        for (Persona d : lista) {
            if (identidad==d.getIdentidad()) {
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
        return "Persona{" + "nombre=" + nombre + ", identidad=" + identidad + ", nacimiento=" + nacimiento + '}';
    }
    
    
}
