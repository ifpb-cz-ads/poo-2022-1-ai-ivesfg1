import JogadorPackage.Jogador;
import JogadorPackage.SexoEnum;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // mais uma vez, ainda nao possui codigo suficiente desenvolvido para que as variaveis abaixo sejam condizentes
        // com a ideia do meu projeto.

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int primeiroNumero = input.nextInt();

        System.out.print("Digite outro numero: ");
        int segundoNumero = input.nextInt();

        int soma = primeiroNumero + segundoNumero;
        System.out.println("A soma dos numeros digitados eh igual a: " + soma);

        if (soma > 10){
            System.out.println("A soma dos numeros informados eh maior do que 10");
        } else {
            System.out.println("A soma dos numeros informados nao eh maior do que 10");
        }

        switch (soma % 2){
            case 0:
                System.out.println("A soma dos numeros informados resulta em um numero par.");
                break;
            default:
                System.out.println("A soma dos numeros informados resulta em um numero impar.");
                break;
        }

        // como o intuito da atividade atual é apenas declarar algumas variaveis e fazer operações logicas alem de
        // utilizar desvio condicional (if-else ou switch-case aproveitei o fato de ainda nao ter feito codigo suficiente
        // pra iniciar o metodo main e decidi deixar comentado abaixo

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
