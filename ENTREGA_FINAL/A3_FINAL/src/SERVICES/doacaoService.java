/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SERVICES;

import MODELS.doacao;
import REPOSITORY.doacaoRepository;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author conta
 */
public class doacaoService {
    
    public doacaoService(){
        
    }
       
    public void cadastraDoacao(String banco, String doador, String tipo, String quantidade){
        
        doacao donate = new doacao(banco,doador,tipo,quantidade);
        
        doacaoRepository repository = new doacaoRepository();
        
        repository.createDoacao(donate);
        
        JOptionPane.showMessageDialog(null, "Doacao Cadastrada com Sucesso");
    }
    
    public DefaultTableModel carregaDados(){
        
        DefaultTableModel tabela = new DefaultTableModel(0,4);
        tabela.setColumnIdentifiers(new Object[]{"Codigo","Banco","Doador","Tipo Sanguineo","Quantidade(ml)"});
      
        doacaoRepository repository = new doacaoRepository();
        ArrayList<doacao> donates = repository.readAllDoacoesstatic();
        
        donates.forEach(donate -> {
            tabela.addRow(new Object[]{
                donate.getCodigo(),
                donate.getBanco(),
                donate.getDoador(),
                donate.getTipo(),
                donate.getQuantidade()
            });
        });
        return tabela;
    }

    public void deleteDados(int codigo) {
        doacaoRepository repository = new doacaoRepository();
        doacao donate = new doacao();
        donate.setCodigo(codigo);
        repository.deleteDoacao(donate);
    }
    
    public void updateDados(int Codigo, String banco, String doador, String tipo, String quantidade){
        
        try{
            doacao donate = new doacao(banco,doador,tipo,quantidade);
        donate.setCodigo(Codigo);
        
        doacaoRepository repository = new doacaoRepository();
        
        repository.updateDoacao(donate);
        JOptionPane.showMessageDialog(null, "Doação Atualizada com Sucesso");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Falha em atualizar doação");
        }
        
    }

    public  DefaultTableModel pesquisaDoacao(String nome){
        doacao doando = new doacao();
        doando.setDoador(nome);
        DefaultTableModel tabela = new DefaultTableModel(0,4);
        tabela.setColumnIdentifiers(new Object[]{"Codigo","Banco","Doador","Tipo Sanguineo","Quantidade(ml)"});
        doacaoRepository repository = new doacaoRepository();
        ArrayList<doacao> donates = repository.pesquisaDoacao(doando);
        
        donates.forEach(donate -> {
            tabela.addRow(new Object[]{
                donate.getCodigo(),
                donate.getBanco(),
                donate.getDoador(),
                donate.getTipo(),
                donate.getQuantidade()
            });
        });
        return tabela;
    }
}
