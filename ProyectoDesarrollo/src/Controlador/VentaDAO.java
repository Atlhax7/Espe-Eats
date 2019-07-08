/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Concesionario;
import Modelo.Pedido;
import Modelo.Usuario;
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
public class VentaDAO {
    
    private Conexion conexion = new Conexion();

    public VentaDAO() {
    }
    
    public Venta getVenta(String cod_factura){
        Connection con = conexion.getConnection();
        Statement st;
        ResultSet rs;
        String sql="SELECT * from venta where cod_factura='"+cod_factura+"'";
        Venta venta = new Venta();
        try {
            st = con.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                venta.setFecha(rs.getString("fecha"));
                venta.setEstado(rs.getString("estado"));
                Pedido ped = new Pedido();
                ped.setCod_pedido(rs.getString("cod_pedido"));
                Usuario user = new Usuario();
                user.setIdUsuario(rs.getString("id_usuario"));
                venta.setPedido(ped);
                venta.setUser(user);
            }
            //JOptionPane.showMessageDialog(null,"Registro creado!!!");
            //Cerramos las conexiones 
            st.close();
            con.close();
        }//Permite determinar los errores 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error no se encontro la factura");
        }
        return venta;
    }
    public void getDetalle(){
    
    }
    
}
