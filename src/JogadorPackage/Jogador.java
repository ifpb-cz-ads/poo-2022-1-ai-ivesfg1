package JogadorPackage;

import PokemonPackage.PokeBox;
import PokemonPackage.Pokemon;

public class Jogador {

    private String nome;
    private SexoEnum sexoEnum;
    private Pokemon[] party;
    private PokeBox pokeBox;

    public Jogador(String nome, SexoEnum sexoEnum) {
        this.nome = nome;
        this.sexoEnum = sexoEnum;
        this.party = new Pokemon[6];
        this.pokeBox = new PokeBox();
    }

    public void capturarPokemon(Pokemon pokemon){
        if (!this.isPartyCompleta()){
            this.adicionarNaParty(pokemon);
            return;
        }
        this.adicionarNaBox(pokemon);
    }

    public void adicionarNaParty(Pokemon pokemon){
        for (int i = 0; i < this.party.length; i++) {
            if (this.party[i] == null){
                this.party[i] = pokemon;
                return;
            }
        }
    }

    public void adicionarNaBox(Pokemon pokemon){
        this.pokeBox.depositarPokemon(pokemon);
    }

    public boolean isPartyCompleta(){

        int contagemDeSlotsLivres = 0;

        for (Pokemon pokemon : this.party) {
            if (pokemon == null) {
                contagemDeSlotsLivres += 1;
            }
        }
        return contagemDeSlotsLivres == 0;
    }

    public String getNome() {
        return nome;
    }

    public SexoEnum getSexoEnum() {
        return sexoEnum;
    }

    public Pokemon[] getParty() {
        return party;
    }

    public PokeBox getPokeBox() {
        return pokeBox;
    }
}
