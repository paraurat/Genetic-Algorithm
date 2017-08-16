package com.kleine.genetic.algorithm;

import com.kleine.genetic.algorithm.gens.Gene;
import com.kleine.genetic.algorithm.predatorandprey.Snake;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Tests the crossover.
 */
public class CrossoverTest extends Crossover {

    private List<Snake> snakes;
    private Snake snake1;
    private Snake snake2;

    @Before
    public void setup() {
        snakes = new ArrayList<>();
        List<Gene> genes1 = Arrays.asList(trait -> 2.5f, trait -> 0.5f);
        snake1 = new Snake(genes1);
        snakes.add(snake1);
        snakes.add(snake1);

        List<Gene> genes2 = Arrays.asList(trait -> 1.5f, trait -> 0.1f);
        snake2 = new Snake(genes2);
        snakes.add(snake2);
        snakes.add(snake2);
    }

    @Test
    public void testCreateOffspring() {
        List<Snake> offspring = this.createOffspring(snake1, snake2);
        assertNotNull(offspring);
        assertEquals(2, offspring.size());
        assertEquals(Arrays.asList(trait -> 2.5f, 0.1f), offspring.get(0).getChromosome());
        assertEquals(Arrays.asList(trait -> 1.5f, 0.5f), offspring.get(1).getChromosome());
    }

    @Test
    public void testCrossoverSnakes() {
        List<Snake> offspring = this.crossoverSnakes(this.snakes);
        assertNotNull(offspring);
        assertEquals(4, offspring.size());
    }
}
