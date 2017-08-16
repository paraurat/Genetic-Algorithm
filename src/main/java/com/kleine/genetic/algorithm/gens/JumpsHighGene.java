package com.kleine.genetic.algorithm.gens;

import java.util.Arrays;

/**
 * A gene for jumping high.
 */
public class JumpsHighGene extends AbstractGene {

    public JumpsHighGene() {
        extremePositiveEffect.add(Trait.JUMPS_HIGH);
        positiveEffect.addAll(Arrays.asList(Trait.FLYING, Trait.FAST));
    }
}
