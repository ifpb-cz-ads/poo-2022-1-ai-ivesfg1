package trainerPackage;

import gymLeaderPackage.GymLeader;
import pokemonPackage.Pokemon;

public class Battle {

    public static void start(Trainer player, GymLeader leader) {

        Pokemon pokemon1 = player.getParty();
        Pokemon pokemon2 = leader.getParty();

        leader.initialPhrase();
        System.out.println();
        System.out.println("VOCE ESTA BATALHANDO CONTRA " + leader.getName());


        while (true) {

            pokemon1.attack(pokemon2);
            if (pokemon2.getHealth() <= 0){
                leader.fainted = true;
                leader.finalPhrase();
                System.out.println("Voce venceu!");
                break;
            }

            pokemon2.attack(pokemon1);
            if (pokemon1.getHealth() <= 0){
                player.fainted = true;
                System.out.println("Voce perdeu...");
                break;
            }
        }
    }
}
