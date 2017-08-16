package com.kleine.genetic.algorithm.predatorandprey;

import com.kleine.genetic.algorithm.gens.Trait;

import java.util.Arrays;
import java.util.List;

/**
 * A dragonfly that could be catched by a gens.
 */
public class Dragonfly {

    public List<Trait> getTraitsOfPrey() {
        return Arrays.asList(Trait.FLYING, Trait.POISON, Trait.SPIKEY);
    }
}
