package com.kleine.genetic.algorithm.gens;

import java.util.Arrays;

/**
 * A slow gene.
 */
public class SlowGene extends AbstractGene {

    public SlowGene() {
        extremeNegativeEffect.addAll(Arrays.asList(Trait.FAST, Trait.FLYING));
        negativeEffect.add(Trait.JUMPS_HIGH);
        positiveEffect.add(Trait.SLOW);
    }
}
