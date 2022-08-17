package trainerPackage;

import pokemonPackage.Pokemon;
import java.util.ArrayList;

public abstract class Trainer {
    private String name;
    private Pokemon party = null;

    public boolean fainted = false;

    public Trainer(String name) {
        this.name = name;
    }

    public void capturar(Pokemon pokemon) {
        this.party = pokemon;
    }

    public String getName() {
        return name;
    }
    public Pokemon getParty() {
        return party;
    }

    public void healPokemons() {
        this.getParty().setHealth(100);
    }
}
