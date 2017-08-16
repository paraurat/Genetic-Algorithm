package com.kleine.genetic.algorithm.gens;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kleine on 11.08.17.
 */
public abstract class AbstractGene implements Gene {

    protected List<Trait> extremeNegativeEffect = new ArrayList<>();
    protected List<Trait> negativeEffect = new ArrayList<>();
    protected List<Trait> positiveEffect = new ArrayList<>();
    protected List<Trait> extremePositiveEffect = new ArrayList<>();

    @Override
    public float applyTrait(Trait trait) {
        float factorOfTrait = trait.getFactor();
        if (extremeNegativeEffect.contains(trait)) {
            return -2 * factorOfTrait;
        }
        if (negativeEffect.contains(trait)) {
            return -1 * factorOfTrait;
        }
        if (positiveEffect.contains(trait)) {
            return factorOfTrait;
        }
        if (extremePositiveEffect.contains(trait)) {
            return 2 * factorOfTrait;
        }
        return 0f;
    }
}
