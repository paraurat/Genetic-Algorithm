package com.kleine.genetic.algorithm.gens;

import java.util.Arrays;

/**
 * A trait for being spikey.
 */
public class SpikeyTraitGene extends AbstractGene {

    public SpikeyTraitGene() {
        positiveEffect.addAll(Arrays.asList(Trait.SPIKEY, Trait.HEAVY, Trait.POISON, Trait.SLOW));
        negativeEffect.add(Trait.FAST);
    }
}
