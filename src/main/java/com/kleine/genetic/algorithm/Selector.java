package com.kleine.genetic.algorithm;

import com.kleine.genetic.algorithm.predatorandprey.Snake;

import java.util.List;
import java.util.Map;

/**
 * Selects the best individuals of the population
 */
public class Selector {

    public List<Snake> selectBestIndividuals(Map<Snake, Float> snakesWithFitness, float percentOfBest) {
        //TODO initialise list
        List<Snake> sortedSnakes = null;
        /**
         * TODO
         * - call sortIndividualsByFitness
         * - only return part of the list by percentOfBest
         */
        return sortedSnakes;
    }

    protected List<Snake> sortIndividualsByFitness(Map<Snake, Float> snakesWithFitness) {
        //TODO initialise list
        List<Snake> sortedSnakes = null;
        /**
         * TODO
         * - sort the snakes by fitness and use a Java Comparator
         */
        return sortedSnakes;
    }
}
