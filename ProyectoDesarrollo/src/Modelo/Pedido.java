/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Pedido {
    
    private String cod_pedido;
    private Concesionario concesionario;
    private LocalDate fecha;
    private String estado  ;
    private Concesionario concesionario1 ;
    private ArrayList<detalle_Pedido> lista_Motos=new ArrayList<>(); 

    public Pedido() {
    }

    public String getCod_pedido() {
        return cod_pedido;
    }

    public void setCod_pedido(String cod_pedido) {
        this.cod_pedido = cod_pedido;
    }

    public Concesionario getConcesionario() {
        return concesionario;
    }

    public void setConcesionario(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Concesionario getConcesionario1() {
        return concesionario1;
    }

    public void setConcesionario1(Concesionario concesionario1) {
        this.concesionario1 = concesionario1;
    }

    public ArrayList<detalle_Pedido> getLista_Motos() {
        return lista_Motos;
    }

    public void setLista_Motos(ArrayList<detalle_Pedido> lista_Motos) {
        this.lista_Motos = lista_Motos;
    }
    
    

    
}
