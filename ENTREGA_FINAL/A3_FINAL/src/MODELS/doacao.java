/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELS;

/**
 *
 * @author conta
 */
public class doacao {
    private int codigo;
    private String banco;
    private String doador;
    private String tipo;
    private String Quantidade;

    public doacao() {
    }
    
    public doacao(String banco, String doador, String tipo, String Quantidade) {
        this.banco = banco;
        this.doador = doador;
        this.tipo = tipo;
        this.Quantidade = Quantidade;
    }

    public String getBanco() {
        return banco;
    }

    public String getDoador() {
        return doador;
    }

    public String getTipo() {
        return tipo;
    }

    public String getQuantidade() {
        return Quantidade;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setBanco(String banco) {
        this.banco = banco;
    }

    public void setDoador(String doador) {
        this.doador = doador;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setQuantidade(String Quantidade) {
        this.Quantidade = Quantidade;
    }

    
   
    
}
