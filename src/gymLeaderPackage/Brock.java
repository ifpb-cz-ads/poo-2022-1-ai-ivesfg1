package gymLeaderPackage;

import pokemonPackage.Pokemon;

public class Brock extends GymLeader {

    public Brock(String name) {
        super(name);
    }

    @Override
    public void initialPhrase() {
        System.out.println("\nBrock: Prepare-se pra lutar com um doido de PEDRA HAHAHAHAHAH!\n");
    }

    @Override
    public void finalPhrase() {
        System.out.println("\nBrock: Eh como dizem... agua mole em pedra dura...\n");
    }
}
