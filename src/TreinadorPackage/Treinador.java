package TreinadorPackage;

import PokemonPackage.PokeBox;
import PokemonPackage.Pokemon;

public class Treinador {

    String nome;
    Pokemon[] party = new Pokemon[6];
    PokeBox pokeBox = new PokeBox();

    public Treinador(String nome, Pokemon[] party) {
        this.nome = nome;
        this.party = party;
    }
}
