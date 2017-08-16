package com.kleine.genetic.algorithm.gens;

import java.util.Arrays;

/**
 * A gene for writhing.
 */
public class WrithingGene extends AbstractGene {

    public WrithingGene() {
        positiveEffect.add(Trait.WRITHING);
        extremeNegativeEffect.addAll(Arrays.asList(Trait.FLYING, Trait.JUMPS_HIGH));
        negativeEffect.addAll(Arrays.asList(Trait.HEAVY, Trait.SPIKEY));
    }
}
