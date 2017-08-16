package com.kleine.genetic.algorithm;

import com.kleine.genetic.algorithm.gens.Gene;
import com.kleine.genetic.algorithm.predatorandprey.Snake;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Tests the Initialisator
 */
public class InitialisatorTest extends Initalisator {

    public InitialisatorTest() {
        super(2, 3);
    }

    @Test
    public void testInitialiseSnakes() {
        List<Snake> snakes = this.initialiseSnakes();
        assertNotNull(snakes);
        assertEquals(2, snakes.size());
    }

    @Test
    public void testCreateChromosome() {
        List<Gene> chromosome = this.createChromosome();
        assertNotNull(chromosome);
        assertEquals(3, chromosome.size());
    }
}
