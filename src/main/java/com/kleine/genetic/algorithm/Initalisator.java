package com.kleine.genetic.algorithm;

import com.kleine.genetic.algorithm.gens.Gene;
import com.kleine.genetic.algorithm.predatorandprey.Snake;

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
        List<Snake> snakesList = null;
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
        //TODO initialise the list
        List<Gene> chromosome = null;
        /**
         * TODO
         * - Create a list of genes with the size of the chromosome.
         * - Create each entry of the list by using the getRandomTeaFromList method and
         * pass it the Gene.ALL_GENES list.
         * - Search for getRandomTeaFromList in this project. CTRL + SHIFT + F
         */
        return chromosome;
    }
}
