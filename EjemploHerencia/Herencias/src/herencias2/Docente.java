/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;

/**
 *
 * @author jamil
 */
public class Docente extends Persona {
    
    private double sueldo;
    
    public Docente(String n, String a, int e, double s){
        super(n, a, e);
        setSueldo(s);
    }
    
    @Override
    public void setNombre(String n){
        nombre = n.toUpperCase();    
    }
    
    public void setSueldo(double s){
        sueldo = s;
    }
    
    public double getSueldo(){
        return sueldo;
    }
    
    /* @Override
    public String toString(){
    
        return String.format("%s - %f", super.toString(), getMatricula());
    }
    */
    
    @Override
    public String toString(){
    
        return String.format("%s - %f", super.toString(), getSueldo());
    }
}

    

