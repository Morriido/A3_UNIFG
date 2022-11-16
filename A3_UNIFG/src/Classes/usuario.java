/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Telas.Menu;
import javax.swing.JOptionPane;

/**
 *
 * @author conta
 */
public class usuario {
    //atributos
    public String login;
    public String senha;
    public int ID;
    
    //funcionalidades
    public void logar(String Usuario, String Senha, String Login, String Pass){
        if(Usuario.equals(Login)&&Senha.equals(Pass)){
            JOptionPane.showMessageDialog(null, "Bem Vindo");
            new Menu().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Login ou senha incorretos.");
        }
    }
    public void registrar(){
        
    }
}
