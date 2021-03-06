package org.academiadecodigo.macasdoze;

/**
 * Generates a random number within a range.
 * <p>
 * Created by vi.KINGS David Neves, Fabio Santos, Helia Marcos and Mario Ponte on 23/05/16.
 */
public class RandomGenerator {

    public static int getRandomNumber(int max) {
        return getRandomByRange(0, max);
    }

    public static int getRandomByRange(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
