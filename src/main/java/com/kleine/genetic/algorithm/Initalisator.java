package com.kleine.genetic.algorithm;

import com.kleine.genetic.algorithm.gens.Gene;
import com.kleine.genetic.algorithm.predatorandprey.Snake;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Initialises a List of Snakes.
 */
public class Initalisator {

    private int amountOfSnakes;
    private int sizeOfChromosome;

    public Initalisator(int amountOfSnakes, int sizeOfChromosome) {
        this.amountOfSnakes = amountOfSnakes;
        this.sizeOfChromosome = sizeOfChromosome;
    }

    /**
     * Creates a list of snakes with an initialised chromosome.
     *
     * @return the list of snakes
     */
    public List<Snake> initialiseSnakes() {
        //TODO initialise the list
        List<Snake> snakesList = new ArrayList<>(amountOfSnakes);
        for (int i = 0; i < amountOfSnakes; i++) {
            List<Gene> chromosome = createChromosome();
            Snake randomTeaFromList = new Snake(chromosome);
            snakesList.add(randomTeaFromList);
        }
        /**
         * TODO
         * - Create a list of snakes with the amount of snakes defined.
         * - Create the chromosome for each snakes by using the createChromosome method.
         */
        return snakesList;
    }

    /**
     * Creates the chromosome consisting of genes.
     *
     * @return the chromosome
     */
    protected List<Gene> createChromosome() {
        List<Gene> chromosome = new ArrayList<>(sizeOfChromosome);
        for (int i = 0; i < sizeOfChromosome; i++) {
            Gene randomTeaFromList = RandomHelper.getRandomTeaFromList(Gene.ALL_GENES);
            chromosome.add(randomTeaFromList);
        }
        return chromosome;
    }
}
