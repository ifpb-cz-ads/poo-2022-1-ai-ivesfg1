import gymLeaderPackage.*;
import pokemonPackage.*;
import trainerPackage.Battle;
import trainerPackage.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Iniciando Scanner

        Scanner input = new Scanner(System.in);

        // Criando lideres de ginasio. (Com fluxo)

        Brock brock = new Brock("Brock");
        brock.capturar(new Onix());

        Misty misty = new Misty("Misty");
        misty.capturar(new Starmie());

        Surge surge = new Surge("Surge");
        surge.capturar(new Raichu());

        ArrayList<GymLeader> fluxo1 = new ArrayList<>();

        fluxo1.add(brock);
        fluxo1.add(misty);
        fluxo1.add(surge);

        ArrayList<GymLeader> fluxo2 = new ArrayList<>();

        fluxo2.add(misty);
        fluxo2.add(brock);
        fluxo2.add(surge);

        ArrayList<GymLeader> fluxo3 = new ArrayList<>();

        fluxo3.add(surge);
        fluxo3.add(misty);
        fluxo3.add(brock);

        // Iniciando Main

        System.out.print("Bem vindo ao mundo Pokemon! Primeiro me diga, qual seu nome? ");
        String nome = input.nextLine();

        Player jogador = new Player(nome);

        System.out.printf("\nBem vindo(a) %s! ", jogador.getName());

        // ESCOLHENDO POKEMON

        System.out.println("Escolha um pokemon:\n");
        System.out.println("1 = Venusaur\n2 = Charizard\n3 = Blastoise\n");

        System.out.print("Sua escolha: ");
        int pokeChoice = input.nextInt();

        String message = " foi adicionado a equipe.";
        switch (pokeChoice){
            case 1:
                Venusaur venusaur = new Venusaur();
                jogador.capturar(venusaur);
                System.out.println("\n" + venusaur.getName() + message);
                break;

                case 2:
                Charizard charizard = new Charizard();
                jogador.capturar(charizard);
                System.out.println("\n" + charizard.getName() + message);
                break;

            case 3:
                Blastoise blastoise = new Blastoise();
                jogador.capturar(blastoise);
                System.out.println("\n" + blastoise.getName() + message);
                break;
        }

        // INICIANDO DESAFIO

        System.out.println("\nSeu objetivo eh batalhar contra os tres melhores treinadores Pokemon do mundo!\n");


        // Perguntando o fluxo

        System.out.println("Qual fluxo você quer seguir?\n");

        System.out.print("1 = ");
        for(int i = 0; i < 3; i++){
            if (i == 2){
                System.out.print(fluxo1.get(i).getName() + "\n");
                break;
            }
            System.out.print(fluxo1.get(i).getName() + " => ");
        }

        System.out.print("2 = ");
        for(int i = 0; i < 3; i++){
            if (i == 2){
                System.out.print(fluxo2.get(i).getName() + "\n");
                break;
            }
            System.out.print(fluxo2.get(i).getName() + " => ");
        }

        System.out.print("3 = ");
        for(int i = 0; i < 3; i++){
            if (i == 2){
                System.out.print(fluxo3.get(i).getName() + "\n");
                break;
            }
            System.out.print(fluxo3.get(i).getName() + " => ");
        }

        System.out.print("\nSua escolha: ");
        int escolha = input.nextInt();

        switch (escolha) {
            case 1:
                for (GymLeader lider : fluxo1) {
                    if (!jogador.fainted) {
                        Battle.start(jogador, lider);
//                        jogador.healPokemons();
                    }
                }
                break;
            case 2:
                for (GymLeader lider : fluxo2) {
                    if (!jogador.fainted) {
                        Battle.start(jogador, lider);
//                        jogador.healPokemons();
                    }
                }
                break;
            case 3:
                for (GymLeader lider : fluxo3) {
                    if (!jogador.fainted) {
                        Battle.start(jogador, lider);
//                        jogador.healPokemons();
                    }
                }
                break;
        }

        // se o jogador nao tiver perdido nenhuma vez nos combates, transforma ele em campeao
        if (!jogador.fainted) {
            jogador.setChampion(true);
        }

        if (jogador.isChampion()) {
            System.out.println("PARABENS! VOCE EH O NOVO CAMPEAO POKEMON!");
        } else {
            System.out.println("Que pena... nao foi dessa vez, quem sabe na proxima.");
        }
    }
}