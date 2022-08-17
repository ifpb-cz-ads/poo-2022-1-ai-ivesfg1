package trainerPackage;

import pokemonPackage.Pokemon;

public class Player extends Trainer {

    private boolean champion = false;

    public Player(String name) {
        super(name);
    }

    public boolean isChampion() {
        return champion;
    }

    public void setChampion(boolean champion) {
        this.champion = champion;
    }
}
