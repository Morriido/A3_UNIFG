/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package REPOSITORY;
import MODELS.doacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.HashSet;

/**
 *
 * @author conta
 */
public class doacaoRepository {

    public static ArrayList<doacao> readAllDoacoes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    Connection conexao;
    
    //cadastrar doação de sangue
    public void createDoacao(doacao doacao1){
        
        try {
            String sql = "insert into doacao (banco,doador,tipo,quantidade) values (?,?,?,?)";
            
            conexao = new Conexao().conectaBD();
            
            PreparedStatement createSQL  = conexao.prepareStatement(sql);
            createSQL.setString(1,doacao1.getBanco());
            createSQL.setString(2,doacao1.getDoador());
            createSQL.setString(3,doacao1.getTipo());
            createSQL.setString(4,doacao1.getQuantidade());
            
            createSQL.execute();
            createSQL.close();
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar doação");
            Logger.getLogger(doacaoRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //visualizar doação de sangue
    public ArrayList<doacao> readAllDoacoesstatic() {
        ArrayList<doacao> donates = new ArrayList<>();
        String sql = "select * from doacao";
        conexao = new Conexao().conectaBD();
        
        try{
            PreparedStatement statement= conexao.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                doacao donate = new doacao();
                donate.setCodigo(rs.getInt("codigo"));
                donate.setBanco(rs.getString("banco"));
                donate.setDoador(rs.getString("doador"));
                donate.setTipo(rs.getString("tipo"));
                donate.setQuantidade(rs.getString("quantidade"));
                
                donates.add(donate);
            }
            
        }catch(SQLException e){
            JOptionPane.showConfirmDialog(null, "Não foi possivel carregar os dados do banco de dados");
            Logger.getLogger(doacaoRepository.class.getName()).log(Level.SEVERE, null, e);
        }
        return donates;
    }
    
    public doacao readDoacoesstatic(doacao doando) {
        String sql = "select * from doacao where codigo = (?) limit 1";
        conexao = new Conexao().conectaBD();
        doacao donate = new doacao();
        try{
            PreparedStatement statement= conexao.prepareStatement(sql);
            statement.setInt(1,doando.getCodigo());
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                
                donate.setCodigo(rs.getInt("codigo"));
                donate.setBanco(rs.getString("banco"));
                donate.setDoador(rs.getString("doador"));
                donate.setTipo(rs.getString("tipo"));
                donate.setQuantidade(rs.getString("quantidade"));
            }
            
        }catch(SQLException e){
            JOptionPane.showConfirmDialog(null, "Não foi possivel carregar os dados do banco de dados");
            Logger.getLogger(doacaoRepository.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return donate;
    }
    
    
    
    //atualizar doação de sangue
    public void updateDoacao(doacao doacao1){
        String sql = "UPDATE doacao SET banco=?,doador=?,tipo=?,quantidade=? WHERE codigo = (?)";
        conexao = new Conexao().conectaBD();
        try{
            PreparedStatement createSQL  = conexao.prepareStatement(sql);
            createSQL.setString(1,doacao1.getBanco());
            createSQL.setString(2,doacao1.getDoador());
            createSQL.setString(3,doacao1.getTipo());
            createSQL.setString(4,doacao1.getQuantidade());
            createSQL.setInt(5,doacao1.getCodigo());
            createSQL.execute();
            createSQL.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro de atualização");
            Logger.getLogger(doacaoRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //deletar doação de sangue
    public void deleteDoacao(doacao doacao1){
        
        String sql = "delete from doacao where codigo = (?) limit 1";
            conexao = new Conexao().conectaBD();
        try { 
            PreparedStatement createSQL  = conexao.prepareStatement(sql);
            createSQL.setInt(1,doacao1.getCodigo());
            createSQL.execute();
            createSQL.close();
            JOptionPane.showMessageDialog(null, "Exclusão concluida com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro de exclusão");
            Logger.getLogger(doacaoRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<doacao> pesquisaDoacao(doacao doacao1){
        ArrayList<doacao> donates = new ArrayList<>();
        String sql = "select * from doacao where doador = ?";
        conexao = new Conexao().conectaBD();
        try{
            PreparedStatement statement= conexao.prepareStatement(sql);
            statement.setString(1,doacao1.getDoador());
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                doacao donate = new doacao();
                donate.setCodigo(rs.getInt("codigo"));
                donate.setBanco(rs.getString("banco"));
                donate.setDoador(rs.getString("doador"));
                donate.setTipo(rs.getString("tipo"));
                donate.setQuantidade(rs.getString("quantidade"));
                
                donates.add(donate);
            }
            
        }catch(SQLException e){
            JOptionPane.showConfirmDialog(null, "Não foi possivel carregar os dados do banco de dados");
            Logger.getLogger(doacaoRepository.class.getName()).log(Level.SEVERE, null, e);
        }
        return donates;
    }
}
