package main;
import objetos.*;

public class Main {
    public static void main(String[] args){

        doador doador1 = new doador();
        doador1.nome = "Kaio";
        doador1.tipo_sanguineo = "A+";
        doador1.idade = 18;
        doador1.ultima_doacao = 0;
        doador1.CPF = 12345;
        doador1.banco = "rua fulano, 123";

        System.out.println(doador1);
        doador1.doar();

    }
}
