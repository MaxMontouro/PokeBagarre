package com.montaury.pokebagarre.metier;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {


    @Test
    public void verifier_si_premier_a_meilleure_attaque_que_le_second(){
        var premier = new Pokemon("Pikachu", "Pika Pika", new Stats(15,1));
        var second = new Pokemon("Rondoudou", "GRRRRRRRRRRRRR", new Stats(1,15));

        var estVainqueur = premier.estVainqueurContre(second);

        assertThat(estVainqueur).isTrue();
    }

    @Test
    public void verifier_si_second_a_meilleure_attaque_que_le_premier(){
        var premier = new Pokemon("Pikachu", "Pika Pika", new Stats(15,1));
        var second = new Pokemon("Rondoudou", "GRRRRRRRRRRRRR", new Stats(20,15));

        var estVainqueur = second.estVainqueurContre(premier);

        assertThat(estVainqueur).isTrue();
    }

    @Test
    public void verifier_si_premier_a_meilleure_defense_et_meme_attaque_que_second(){
        var premier = new Pokemon("Pikachu", "Pika Pika", new Stats(15,100));
        var second = new Pokemon("Rondoudou", "GRRRRRRRRRRRRR", new Stats(15,15));

        var estVainqueur = premier.estVainqueurContre(second);

        assertThat(estVainqueur).isTrue();
    }

    @Test
    public void verifier_si_second_a_meilleure_defense_et_meme_attaque_que_premeir(){
        var premier = new Pokemon("Pikachu", "Pika Pika", new Stats(15,100));
        var second = new Pokemon("Rondoudou", "GRRRRRRRRRRRRR", new Stats(15,150));

        var estVainqueur = second.estVainqueurContre(premier);

        assertThat(estVainqueur).isTrue();
    }

    @Test
    public void verifier_si_meme_stats_premier_passe(){
        var premier = new Pokemon("Pikachu", "Pika Pika", new Stats(15,100));
        var second = new Pokemon("Rondoudou", "GRRRRRRRRRRRRR", new Stats(15,100));

        var estVainqueur = premier.estVainqueurContre(second);

        assertThat(estVainqueur).isTrue();
    }
}