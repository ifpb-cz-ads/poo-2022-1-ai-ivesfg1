package GinasioPackage;

import JogadorPackage.Jogador;
import PokemonPackage.Pokemon;
import TreinadorPackage.Treinador;

// TODO: talvez isso caia melhor como uma interface
public class LiderDeGinasio extends Treinador {

    Insignia insigniaDoLider;
    public LiderDeGinasio(String nome, Pokemon[] party, Insignia insigniaDoLider) {
        super(nome, party);
        this.insigniaDoLider = insigniaDoLider;
    }

    public void entregarInsignia(Jogador desafiante) {
        desafiante.receberInsignia(this.insigniaDoLider);
    };
}
