package com.kleine.genetic.algorithm.gens;

import java.util.Arrays;

/**
 * A gene for being able to smell good.
 */
public class SmellsGoodGene extends AbstractGene {

    public SmellsGoodGene() {
        negativeEffect.add(Trait.SMELLS_GOOD);
        positiveEffect.addAll(Arrays.asList(Trait.POISON, Trait.SLOW));
    }
}
