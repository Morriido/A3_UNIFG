/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SERVICES;

import MODELS.login;
import REPOSITORY.loginRepository;
import VIEW.Menu;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author conta
 */
public class loginService {
    public static void cadastraLogin(String login, String senha){
        login contaCreate = new login(login,senha);
        loginRepository contaCreateRepository = new loginRepository();
        contaCreateRepository.createLogin(contaCreate);
        
         JOptionPane.showMessageDialog(null, "Conta Cadastrada com Sucesso");
    }
    public ResultSet verificaLogin(String login, String senha){
        login contaVerify = new login(login, senha);
        loginRepository contaVerifyRepository = new loginRepository();
        ResultSet rsLogin = contaVerifyRepository.autenticacaoLogin(contaVerify);
        return rsLogin;
        
        
       
        
    }
    
}
