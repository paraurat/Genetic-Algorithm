package com.kleine.genetic.algorithm.gens;

/**
 * A fast gene.
 */
public class FastGene extends AbstractGene {

    public FastGene() {
        negativeEffect.add(Trait.HEAVY);
        positiveEffect.add(Trait.FAST);
        extremePositiveEffect.add(Trait.SLOW);
    }
}
