package com.kleine.genetic.algorithm.gens;

import java.util.Arrays;

/**
 * A flying gene.
 */
public class FlyingGene extends AbstractGene {

    public FlyingGene() {
        positiveEffect.addAll(Arrays.asList(Trait.FAST, Trait.JUMPS_HIGH));
        extremePositiveEffect.add(Trait.FLYING);
    }
}
