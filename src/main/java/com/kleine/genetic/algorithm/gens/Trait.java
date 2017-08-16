package com.kleine.genetic.algorithm.gens;

/**
 * An enum of traits with factors.
 */
public enum Trait {
    FLYING(5f),
    POISON(4f),
    HEAVY(2.3f),
    SLOW(1.6f),
    FAST(3f),
    SMELLS_GOOD(1.3f),
    JUMPS_HIGH(2.8f),
    WRITHING(1.3f),
    LONG_TONGUE(1.6f),
    SPIKEY(2.7f),
    FAST_REACTION(3.2f);

    private float factor;

    Trait(float factor) {
        this.factor = factor;
    }

    /**
     * @return the factor of the trait
     */
    float getFactor() {
        return factor;
    }
}
