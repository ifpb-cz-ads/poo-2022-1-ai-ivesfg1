package TreinadorPackage;

import PokemonPackage.Pokemon;

public class Treinador {

    String nome;
    Pokemon[] party = new Pokemon[6];

    public Treinador(String nome, Pokemon[] party) {
        this.nome = nome;
        this.party = party;
    }
}
