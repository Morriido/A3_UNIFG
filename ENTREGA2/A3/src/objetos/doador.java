package objetos;

import java.util.Scanner;

public class doador {
    Scanner input = new Scanner(System.in);
    public String nome;
    public String tipo_sanguineo;
    public int idade;
    public int ultima_doacao;
    public int CPF;
    public String banco;

    public void doar(){
        System.out.println("digite a data de hoje sem / (exemplo: 21/08/22 = 210822 ");
        ultima_doacao = input.nextInt();
        System.out.println(nome + " doou sangue do tipo " + tipo_sanguineo);
    }

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
