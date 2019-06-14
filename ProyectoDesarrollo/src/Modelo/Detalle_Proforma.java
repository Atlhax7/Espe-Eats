/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author diego
 */
public class Detalle_Proforma {
    
    private Moto moto;
    private int cantidad;
    private String color;
    private float valor_detalle;

    public Detalle_Proforma() {
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getValor_detalle() {
        return valor_detalle;
    }

    public void setValor_detalle(float valor_detalle) {
        this.valor_detalle = valor_detalle;
    }
    
    
    
    
}
