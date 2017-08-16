package com.kleine.genetic.algorithm.gens;

import java.util.Arrays;

/**
 * A gene for having a long tongue.
 */
public class LongTongueGene extends AbstractGene {

    public LongTongueGene() {
        positiveEffect.addAll(Arrays.asList(Trait.FLYING, Trait.JUMPS_HIGH, Trait.SLOW));
        negativeEffect.add(Trait.HEAVY);
        extremeNegativeEffect.add(Trait.POISON);
    }
}
