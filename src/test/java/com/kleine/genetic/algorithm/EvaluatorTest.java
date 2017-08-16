package com.kleine.genetic.algorithm;

import com.kleine.genetic.algorithm.gens.AbstractGene;
import com.kleine.genetic.algorithm.gens.Gene;
import com.kleine.genetic.algorithm.gens.Trait;
import com.kleine.genetic.algorithm.predatorandprey.Prey;
import com.kleine.genetic.algorithm.predatorandprey.Snake;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Tests the evaluator.
 */
public class EvaluatorTest {

    private List<Snake> snakes;
    private Snake snake1;
    private Snake snake2;
    private Prey prey;

    @Before
    public void setup() {
        snakes = new ArrayList<>();
        List<Gene> genes1 = Collections.singletonList(trait -> 2.5f);
        snake1 = new Snake(genes1);
        snakes.add(snake1);

        List<Gene> genes2 = Collections.singletonList(trait -> 1.5f);
        snake2 = new Snake(genes2);
        snakes.add(snake2);

        prey = () -> Collections.singletonList(Trait.FLYING);
    }

    @Test
    public void testEvaluateSnakes() {
        Evaluator evaluator = new Evaluator();
        Map<Snake, Float> snakesWithFitness = evaluator.evaluateSnakes(snakes, prey);
        assertNotNull(snakesWithFitness);
        assertEquals(2, snakesWithFitness.size());
        assertTrue(snakesWithFitness.containsKey(snake1));
        float snake1Fitness = snakesWithFitness.get(snake1);
        assertEquals(2.5f, snake1Fitness, 0f);

        assertTrue(snakesWithFitness.containsKey(snake2));
        float snake2Fitness = snakesWithFitness.get(snake2);
        assertEquals(1.5f, snake2Fitness, 0f);
    }
}
