package com.kleine.genetic.algorithm.gens;

import java.util.Arrays;

/**
 * A poison gene.
 */
public class PoisonGene extends AbstractGene {

    public PoisonGene() {
        extremePositiveEffect.add(Trait.POISON);
        positiveEffect.addAll(Arrays.asList(Trait.SLOW, Trait.FAST, Trait.JUMPS_HIGH, Trait.SPIKEY));
    }
}
