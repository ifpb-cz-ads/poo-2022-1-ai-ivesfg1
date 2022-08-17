package gymLeaderPackage;

import pokemonPackage.Pokemon;

public class Misty extends GymLeader {
    public Misty(String name) {
        super(name);
    }

    @Override
    public void initialPhrase() {
        System.out.println("\nMisty: Meu POKEMON vai te afogar!\n");
    }

    @Override
    public void finalPhrase() {
        System.out.println("\nMisty: Voce nao me disse que sabia nadar...\n");
    }
}
