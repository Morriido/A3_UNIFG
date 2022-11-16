/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Scanner;

public class doador {
    Scanner input = new Scanner(System.in);
    public String nome;
    public String tipo_sanguineo;
    public int idade;
    public int ultima_doacao;
    public int CPF;
    public String banco;


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        if(ultima_doacao == 0){
            return "nome: " + nome +
        "\ntipo sanguineo:  " + tipo_sanguineo + 
        "\nidade: " + idade + 
        "\nultima doação: nunca" +
        "\nCPF: " + CPF + 
        "\nbanco de sangue: " + banco;
        }else{
            return "nome: " + nome +
        "\ntipo sanguineo:  " + tipo_sanguineo + 
        "\nidade: " + idade + 
        "\nultima doação: " + ultima_doacao +
        "\nCPF: " + CPF + 
        "\nbanco de sangue: " + banco;
        }
        
    }
}
