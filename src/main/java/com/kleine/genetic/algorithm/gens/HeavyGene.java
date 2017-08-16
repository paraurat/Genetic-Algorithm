package com.kleine.genetic.algorithm.gens;

/**
 * A heavy gene.
 */
public class HeavyGene extends AbstractGene {

    public HeavyGene() {
        positiveEffect.add(Trait.SLOW);
        extremePositiveEffect.add(Trait.HEAVY);
    }
}
