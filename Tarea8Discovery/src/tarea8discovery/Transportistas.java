package tarea8discovery;

import java.util.Date;

public class Transportistas extends Persona{
    
    private int aniosexp;
    private String apodo;

    public Transportistas() {
    }

    public Transportistas(int aniosexp, String apodo, String nombre, int identidad, Date nacimiento) {
        super(nombre, identidad, nacimiento);
        this.aniosexp = aniosexp;
        this.apodo = apodo;
    }

    public int getAniosexp() {
        return aniosexp;
    }

    public void setAniosexp(int aniosexp) {
        this.aniosexp = aniosexp;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return super.toString()+" Transportistas{" + "aniosexp=" + aniosexp + ", apodo=" + apodo + '}';
    }

    
    
}
