package PokemonPackage;

public class Pokemon {

    private String nome;
    private int hp;
    private int ataque;
    private int defesa;
    private int velocidade;
    private boolean desmaiado;

    public Pokemon(String nome, int hp, int ataque, int defesa, int velocidade) {
        this.nome = nome;
        this.hp = hp;
        this.ataque = ataque;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.desmaiado = false;
    }

    public void atacar(Pokemon pokemonAdversario){

        // TODO: procurar refatorar utilizando metodo abs da lib Math.

        int valorDaDiferenca;
        int danoARetirar = this.ataque;

        if (pokemonAdversario.getDefesa() > danoARetirar){
            valorDaDiferenca = pokemonAdversario.getDefesa() - danoARetirar;
            danoARetirar -= valorDaDiferenca;
        }
        else if (pokemonAdversario.getDefesa() < danoARetirar){
            valorDaDiferenca = danoARetirar - pokemonAdversario.getDefesa();
            danoARetirar += valorDaDiferenca;
        }
        pokemonAdversario.sofrerAtaque(danoARetirar);
    }

    public void sofrerAtaque(int valorDoDano){
        this.hp -= valorDoDano;
    }

    public String getNome() {
        return nome;
    }

    public int getHp() {
        return hp;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getVelocidade() {
        return velocidade;
    }
}
