package com.kleine.genetic.algorithm.gens;

import java.util.Arrays;

/**
 * A gene for having fast reactions.
 */
public class FastReactionGene extends AbstractGene {

    public FastReactionGene() {
        extremePositiveEffect.add(Trait.SLOW);
        positiveEffect.addAll(Arrays.asList(Trait.FAST_REACTION, Trait.FAST, Trait.JUMPS_HIGH));
    }
}
