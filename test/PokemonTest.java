import org.junit.Assert;
import org.junit.Test;

import PokemonPackage.Pokemon;

public class PokemonTest {

    @Test
    public void DeveInflingirDanoInteiroAoAtacarQuandoPoderDeAtaqueForIgualDefesaDoInimigo(){
        /*
        * No exemplo abaixo, Pikachu TEM poder de ataque suficiente para inflingir dano
        * INTEIRO ao Bulbasaur, pois segundo a formula atual definida para ataque:
        *
        * com o valor de ataque do pikachu sendo 20, e a defesa do bulbasauro sendo 20, o dano
        * inflingido é de valor inteiro, pois não há diferença entre o valor de ataque do pikachu
        * e o valor da defesa do bulbassauro.
        * */

        Pokemon pikachu = new Pokemon("Pikachu", 100, 20, 20, 60);
        Pokemon bulbasaur = new Pokemon("Bulbasaur", 110, 15, 20, 40);

        int valorDeHpDoAdversarioEsperado = 90;

        pikachu.atacar(bulbasaur);

        Assert.assertEquals(valorDeHpDoAdversarioEsperado, bulbasaur.getHp());
    }

    @Test
    public void DeveInflingirDanoComDiferencaAoAtacarQuandoPoderDeAtaqueForMaiorQueDefesaDoAtacado(){
        /*
         * No exemplo abaixo, Charmander TEM poder de ataque suficiente para inflingir dano
         * ACIMA do valor INTEIRO ao Bulbasaur, pois segundo a formula atual definida para ataque:
         *
         * com o valor de ataque do Charmander sendo 25, e a defesa do bulbasauro sendo 20, o dano
         * inflingido é de valor 30, pois como o dano do charmander é maior do que a defesa do bulbassauro,
         * aplica-se a formula: danoAInflingir = danoDoAtacante + (danoDoAtacante - defesaDoInimigo)
         * */

        Pokemon charmander = new Pokemon("Charmander", 90, 25, 15, 55);
        Pokemon bulbasaur = new Pokemon("Bulbasaur", 110, 15, 20, 40);

        int valorDeHpDoAdversarioEsperado = 80;

        charmander.atacar(bulbasaur);

        Assert.assertEquals(valorDeHpDoAdversarioEsperado, bulbasaur.getHp());
    }

    @Test
    public void DeveInflingirDanoComDiferencaAoAtacarQuandoPoderDeAtaqueForMenorQueDefesaDoAtacado(){
        /*
         * No exemplo abaixo, Pidgey NAO TEM poder de ataque suficiente para inflingir dano INTEIRO
         * ao Bulbasaur, pois segundo a formula atual definida para ataque:
         *
         * com o valor de ataque do Pidgey sendo 15, e a defesa do bulbasauro sendo 20, o dano
         * inflingido é de valor 10, pois como o dano do Pidgey é menor do que a defesa do bulbasaur,
         * aplica-se a formula: danoAInflingir = danoDoAtacante - (defesaDoInimigo - danoDoAtacante)
         * */

        Pokemon pidgey = new Pokemon("Pidgey", 60, 15, 20, 60);
        Pokemon bulbasaur = new Pokemon("Bulbasaur", 110, 15, 20, 40);

        int valorDeHpDoAdversarioEsperado = 100;

        pidgey.atacar(bulbasaur);

        Assert.assertEquals(valorDeHpDoAdversarioEsperado, bulbasaur.getHp());
    }
}
