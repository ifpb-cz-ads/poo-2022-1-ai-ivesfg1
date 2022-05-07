import JogadorPackage.Jogador;
import JogadorPackage.SexoEnum;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        SexoEnum sexo = null;
        String nome;

        System.out.println("Bem vindo ao mundo Pokemon!, você é menino ou menina?");
        System.out.println("\n[0] Menino\n[1] Menina");
        System.out.print("\nSua opção: ");

        int opcao = input.nextInt();

        if (opcao == 0) {
            sexo = SexoEnum.MENINO;
        }
        else if (opcao == 1) {
            sexo = SexoEnum.MENINA;
        }

        System.out.print("Digite seu nome: ");
        nome = input.nextLine();

        Jogador jogador = new Jogador(nome, sexo);
    }
}
