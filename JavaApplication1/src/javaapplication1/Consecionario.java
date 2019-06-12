/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Erick
 */
public class Consecionario {

    public Consecionario(String Name, int Direcciont, String Telefono, String IdConcesionario) {
        this.Name = Name;
        this.Direcciont = Direcciont;
        this.Telefono = Telefono;
        this.IdConcesionario = IdConcesionario;
    }
    private String Name;
    private int Direcciont; 
    private String Telefono ;
    private String IdConcesionario;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getDirecciont() {
        return Direcciont;
    }

    public void setDirecciont(int Direcciont) {
        this.Direcciont = Direcciont;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getIdConcesionario() {
        return IdConcesionario;
    }

    public void setIdConcesionario(String IdConcesionario) {
        this.IdConcesionario = IdConcesionario;
    }

    @Override
    public String toString() {
        return "Concecionario{" + "Name=" + Name + ", Direcciont=" + Direcciont + ", Telefono=" + Telefono + ", IdConcesionario=" + IdConcesionario + '}';
    }
    
    
    
    
}
