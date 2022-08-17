package gymLeaderPackage;

import pokemonPackage.Pokemon;

public class Surge extends GymLeader {

    public Surge(String name) {
        super(name);
    }

    @Override
    public void initialPhrase() {
        System.out.println("\nSurge: TA EM SHOCK???? HAHAHAHAHHA\n");
    }

    @Override
    public void finalPhrase() {
        System.out.printf("\nSurge: Roupa de borracha nao vale...\n");
    }
}
