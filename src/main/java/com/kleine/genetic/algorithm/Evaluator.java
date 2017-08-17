package com.kleine.genetic.algorithm;

import com.kleine.genetic.algorithm.predatorandprey.Prey;
import com.kleine.genetic.algorithm.predatorandprey.Snake;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Evaluates a list of snakes.
 */
public class Evaluator {

    /**
     * Evaluates the fitness of the snakes against the prey and returns the snakes mapped to their fitness.
     *
     * @param snakes the snakes that are being evaluated
     * @param prey the prey that the snakes are being tested with
     * @return the snakes mapped to their fitness in a Map
     */
    public Map<Snake, Float> evaluateSnakes(List<Snake> snakes, Prey prey) {
        //TODO initialise the map
        Map<Snake, Float> result = new HashMap<>();
        for(int i = 0; i < snakes.size(); i++) {
            Snake snake = snakes.get(i);
            float fitness = snake.catchPrey(prey);
            result.put(snake, fitness);
        }
        /**
         * TODO
         * - Use the catchPrey method of the snake to get the fitness value of the snake
         * - Put the snake and its fitness value into the map
         */
        return result;
    }
}
