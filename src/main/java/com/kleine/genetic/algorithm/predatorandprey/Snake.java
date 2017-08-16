package com.kleine.genetic.algorithm.predatorandprey;

import com.kleine.genetic.algorithm.gens.Gene;
import com.kleine.genetic.algorithm.gens.Trait;

import java.util.List;

/**
 * A gens that could catch a dragonfly.
 */
public class Snake {

    List<Gene> chromosome;

    public Snake(List<Gene> chromosome) {
        this.chromosome = chromosome;
    }

    public float catchPrey(Prey prey) {
        float result = 0f;
        List<Trait> traitsOfDragonfly = prey.getTraitsOfPrey();
        for (Gene gene : chromosome) {
            for (Trait dragonFlyTrait : traitsOfDragonfly) {
                result += gene.applyTrait(dragonFlyTrait);
            }
        }
        return result;
    }

    public List<Gene> getChromosome() {
        return chromosome;
    }

    public void setChromosome(List<Gene> chromosome) {
        this.chromosome = chromosome;
    }
}
