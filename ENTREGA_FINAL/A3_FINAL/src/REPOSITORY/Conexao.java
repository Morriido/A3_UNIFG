/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package REPOSITORY;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
        
/**
 *
 * @author conta
 */
public class Conexao {
    
    public Connection conectaBD(){
        Connection conexao = null;
        try {
            String url = "jdbc:mysql://localhost:3306/a3bd?useTimezone=true&serverTimezone=UTC";
            String usuario = "root";
            String senha = "123456";
            
            conexao = DriverManager.getConnection(url, usuario, senha);
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao banco de dados");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            return conexao;
        }
    }
}
