package PokemonPackage;

import java.util.ArrayList;

public class PokeBox {

    // TODO: Implementar metodo de busca de pokemon na box.

    private ArrayList<Pokemon> pokemons = new ArrayList<>();

    public void depositarPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    public Pokemon retirarPokemon(Pokemon pokemon){

        int indiceDoPokemonNoArrayList = this.pokemons.indexOf(pokemon);
        Pokemon pokemonRemovido = this.pokemons.get(indiceDoPokemonNoArrayList);

        this.pokemons.remove(pokemonRemovido);
        return pokemonRemovido;
    }

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }
}
