import JogadorPackage.Jogador;
import JogadorPackage.SexoEnum;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int variavelInteira = 10;
        int variavelInteira2 = 5;

        int somaDasVariaveisInteiras = variavelInteira + variavelInteira2;

        System.out.println(somaDasVariaveisInteiras);

        boolean variavelBooleana = somaDasVariaveisInteiras > 10;
        System.out.println(variavelBooleana);

        double variavelDouble = 2.5;
        int variavelInteira3 = 4;

        int parteInteiraDaOperacao = (int) variavelDouble + variavelInteira3;
        System.out.println(parteInteiraDaOperacao);

        // como o intuito da atividade atual é apenas declarar algumas variaveis e fazer operações logicas
        // aproveitei o fato de ainda nao ter feito codigo suficiente pra iniciar o metodo main e decidi deixar
        // comentado abaixo

//        Scanner input = new Scanner(System.in);
//
//        SexoEnum sexo = null;
//        String nome;
//
//        System.out.println("Bem vindo ao mundo Pokemon!, você é menino ou menina?");
//        System.out.println("\n[0] Menino\n[1] Menina");
//        System.out.print("\nSua opção: ");
//
//        int opcao = input.nextInt();
//
//        if (opcao == 0) {
//            sexo = SexoEnum.MENINO;
//        }
//        else if (opcao == 1) {
//            sexo = SexoEnum.MENINA;
//        }
//
//        System.out.print("Digite seu nome: ");
//        nome = input.nextLine();
//
//        Jogador jogador = new Jogador(nome, sexo);
    }
}
