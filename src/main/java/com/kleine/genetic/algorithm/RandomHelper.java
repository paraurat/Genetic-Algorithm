package com.kleine.genetic.algorithm;

import java.util.List;
import java.util.Random;

/**
 * Helps with random stuff, literally.
 */
public class RandomHelper {

    /**
     * Returns a random element from a list. It's tea time!
     *
     * @param listOfTea the list
     * @param <T> the type of elements of the list
     * @return the random element
     */
    public static <T> T getRandomTeaFromList(final List<T> listOfTea) {
        int randomListIndex = getRandomListIndex(listOfTea);
        return listOfTea.get(randomListIndex);
    }

    /**
     * Get the random index from a list.
     *
     * @param listOfTea the list
     * @param <T> the type of elements of the list
     * @return the random index
     */
    public static <T> int getRandomListIndex(List<T> listOfTea) {
        if (listOfTea == null) {
            throw new IllegalArgumentException("listOfTea cannot be null!");
        }
        Random random = new Random();
        double randomDouble = random.nextDouble();
        return (int) (listOfTea.size() * randomDouble);
    }
}
