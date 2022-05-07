import JogadorPackage.Jogador;
import JogadorPackage.SexoEnum;
import org.junit.Assert;
import org.junit.Test;

import PokemonPackage.Pokemon;

public class BoxTest {

    @Test
    public void DeveAdicionarCorretamenteNaPartyDoJogadorQuandoHouverSlotVazio(){

        Jogador ivesfg1 = new Jogador("Ives", SexoEnum.MENINO);

        Pokemon pikachu = new Pokemon("Pikachu", 100, 20, 20, 60);
        Pokemon bulbasaur = new Pokemon("Bulbasaur", 110, 15, 20, 40);
        Pokemon charmander = new Pokemon("Charmander", 90, 25, 15, 55);
        Pokemon pidgey = new Pokemon("Pidgey", 60, 15, 20, 60);
        Pokemon rattata = new Pokemon("Rattata", 10, 10, 10, 10);

        ivesfg1.capturarPokemon(pikachu);
        ivesfg1.capturarPokemon(bulbasaur);
        ivesfg1.capturarPokemon(charmander);
        ivesfg1.capturarPokemon(pidgey);
        ivesfg1.capturarPokemon(rattata);

        Pokemon suicune = new Pokemon("Suicune", 100, 100, 100, 100);
        ivesfg1.capturarPokemon(suicune);

        Pokemon[] arrayDaPartyEsperado = new Pokemon[]{pikachu, bulbasaur, charmander, pidgey, rattata, suicune};
        Assert.assertArrayEquals(arrayDaPartyEsperado, ivesfg1.getParty());
    }

    @Test
    public void DeveAdicionarCorretamenteNaBoxQuandoPartyDoJogadorEstiverCheia(){

        Jogador ivesfg1 = new Jogador("Ives", SexoEnum.MENINO);

        Pokemon pikachu = new Pokemon("Pikachu", 100, 20, 20, 60);
        Pokemon bulbasaur = new Pokemon("Bulbasaur", 110, 15, 20, 40);
        Pokemon charmander = new Pokemon("Charmander", 90, 25, 15, 55);
        Pokemon pidgey = new Pokemon("Pidgey", 60, 15, 20, 60);
        Pokemon rattata = new Pokemon("Rattata", 10, 10, 10, 10);
        Pokemon caterpie = new Pokemon("Caterpie", 5, 5, 5, 5);

        ivesfg1.capturarPokemon(pikachu);
        ivesfg1.capturarPokemon(bulbasaur);
        ivesfg1.capturarPokemon(charmander);
        ivesfg1.capturarPokemon(pidgey);
        ivesfg1.capturarPokemon(rattata);
        ivesfg1.capturarPokemon(caterpie);

        Pokemon suicune = new Pokemon("Suicune", 100, 100, 100, 100);
        ivesfg1.capturarPokemon(suicune);

//        Pokemon[] arrayDaPartyEsperado = new Pokemon[]{pikachu, bulbasaur, charmander, pidgey, rattata, caterpie};
//        Assert.assertArrayEquals(arrayDaPartyEsperado, ivesfg1.getParty());

        Assert.assertTrue(ivesfg1.getPokeBox().getPokemons().contains(suicune));
    }
}
