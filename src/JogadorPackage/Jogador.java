package JogadorPackage;

import GinasioPackage.Insignia;
import PokemonPackage.PokeBox;
import PokemonPackage.Pokemon;

public class Jogador {

    private String nome;
    private SexoEnum sexoEnum;
    private Pokemon[] party;
    private PokeBox pokeBox;
    private Insignia[] insignias;

    public Jogador(String nome, SexoEnum sexoEnum) {
        this.nome = nome;
        this.sexoEnum = sexoEnum;
        this.party = new Pokemon[6];
        this.pokeBox = new PokeBox();
        this.insignias = new Insignia[8];
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

    public void receberInsignia(Insignia insigniaDoLider) {
        for (int i = 0; i < this.party.length; i++) {
            if (this.insignias[i] == null && this.insignias[i] != insigniaDoLider){
                this.insignias[i] = insigniaDoLider;
                return;
            }
        }
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
