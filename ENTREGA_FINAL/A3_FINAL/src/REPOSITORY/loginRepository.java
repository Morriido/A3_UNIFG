/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package REPOSITORY;
import MODELS.doacao;
import MODELS.login;
import VIEW.Login;
import VIEW.Menu;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author conta
 */
public class loginRepository {
    Connection conexao;
    
    
    //criar conta
    // corrigir erro de criação
    public void createLogin(login login1){
        conexao = new Conexao().conectaBD();
        
        try{
            String sql = "insert into login (login,senha) values (?,?)";
            
            
            PreparedStatement createLogin  = conexao.prepareStatement(sql);
            createLogin.setString(1, login1.getLogin());
            createLogin.setString(2,login1.getSenha());
            createLogin.execute();
            createLogin.close();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar o login");
            Logger.getLogger(doacaoRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //logar
    public ResultSet autenticacaoLogin(login login1){
        conexao = new Conexao().conectaBD();
        
        try{
            String sql = "select * from login where login = ? and senha = ?";
            
            
            PreparedStatement createLogin  = conexao.prepareStatement(sql);
            createLogin.setString(1, login1.getLogin());
            createLogin.setString(2,login1.getSenha());
            
            ResultSet rs = createLogin.executeQuery();
            return rs;
            
            
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar login. ERRO: loginRepository");
            Logger.getLogger(doacaoRepository.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
