package com.kleine.genetic.algorithm.predatorandprey;

import com.kleine.genetic.algorithm.gens.Trait;

import java.util.List;

/**
 * A prey.
 */
@FunctionalInterface
public interface Prey {

    /**
     * Returns the traits of the prey.
     *
     * @return the traits of the prey.
     */
    List<Trait> getTraitsOfPrey();
}
