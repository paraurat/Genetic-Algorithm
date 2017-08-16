package com.kleine.genetic.algorithm;

import com.kleine.genetic.algorithm.predatorandprey.Snake;

import java.util.List;

/**
 * Crossover of snake chromosomes.
 */
public class Crossover {

    public List<Snake> crossoverSnakes(List<Snake> snakes) {
        //TODO initialise the list
        List<Snake> childrenSnakes = null;
        /**
         * TODO
         * - Use the createOffspring method and pass in tuples from the list of snakes.
         * - Collect the children and return them as next generation.
         */
        return childrenSnakes;
    }

    protected List<Snake> createOffspring(Snake fatherSnake, Snake motherSnake) {
        if (fatherSnake != null || motherSnake != null) {
            throw new IllegalStateException("There should be always two parents for children!");
        }
        //TODO initialise the list
        List<Snake> childrenSnakes = null;
        /**
         * TODO
         * - Get the Chromosomes of both parents and split them by half.
         * - Create a new child with the first part of the father and the second part of the mother.
         * - Create another child with the second part of the father and the first part of the mother.
         * - Return both, two children.
         */
        return childrenSnakes;
    }
}
