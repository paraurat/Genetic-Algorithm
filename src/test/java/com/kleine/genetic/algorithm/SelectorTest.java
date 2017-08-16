package com.kleine.genetic.algorithm;

import com.kleine.genetic.algorithm.gens.Gene;
import com.kleine.genetic.algorithm.predatorandprey.Snake;
import org.junit.After;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Tests the selector.
 */
public class SelectorTest extends Selector {

    private Map<Snake, Float> snakesWithFitness;
    private Snake snake1;
    private Snake snake2;

    @After
    public void setup() {
        snakesWithFitness = new HashMap<>();
        List<Gene> genes1 = Collections.singletonList(trait -> 1f);
        snake1 = new Snake(genes1);
        snakesWithFitness.put(snake1, 1f);

        List<Gene> genes2 = Collections.singletonList(trait -> 2f);
        snake2 = new Snake(genes2);
        snakesWithFitness.put(snake2, 2f);
    }

    @Test
    public void testSortIndividualsByFitness() {
        List<Snake> sortedSnakes = this.sortIndividualsByFitness(snakesWithFitness);
        assertNotNull(sortedSnakes);
        assertEquals(2, sortedSnakes.size());

        assertTrue(sortedSnakes.contains(snake1));
        assertTrue(sortedSnakes.contains(snake2));

        assertEquals(snake2, sortedSnakes.get(0));
        assertEquals(snake1, sortedSnakes.get(1));
    }

    @Test
    public void testSelectBestIndividuals() {
        List<Snake> sortedSnakes = this.selectBestIndividuals(snakesWithFitness, 0.5f);
        assertNotNull(sortedSnakes);
        assertEquals(1, sortedSnakes.size());

        assertEquals(snake2, sortedSnakes.get(0));
    }
}
