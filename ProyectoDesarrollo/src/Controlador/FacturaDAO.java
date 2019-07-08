/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Factura;
import Modelo.Venta;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class FacturaDAO {
    private Conexion conexion = new Conexion();

    public FacturaDAO() {
    }
    
    public void agregarFactura(Factura factura){
        Connection con = conexion.getConnection();
        Statement st;
        String sql="";
        try {
            st = con.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Registro creado!!!");
            //Cerramos las conexiones 
            st.close();
            con.close();
        }//Permite determinar los errores 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error no se puede registrar factura");
        }
    }
    
    public Factura buscarFactura(Factura factura){
        Connection con = conexion.getConnection();
        Statement st;
        ResultSet rs;
        String sql="SELECT * factura where cod_factura='"+factura.getCod_factura()+"'";
        try {
            st = con.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                factura.setSubtotal(rs.getFloat("sub_total"));
                factura.setImp(rs.getFloat("impuestos"));
                factura.setTotal(rs.getFloat("total"));
            }
            //JOptionPane.showMessageDialog(null,"Registro creado!!!");
            //Cerramos las conexiones 
            st.close();
            con.close();
        }//Permite determinar los errores 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error no se encontro la factura");
        } 
        return factura;
    }
    
    public void eliminarFactura(Factura factura){
    
    }
    
}
