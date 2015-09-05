package diogoarm.example;


import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;
import static org.junit.Assert.*;

/**
 * Created by diogoam on 05/09/2015.
 */
public class Question01Test {

    @Test
    public void startWithUpperCaseAZ() {
        // A - Z
        IntStream.range(65,90).forEach(num -> {
            assertTrue(Question01.startsWithUpperCaseAZ(((char) num) + "xyz"));
        });
    }

    @Test
    public void startWithUpperCaseAZLower() {
        // a - z
        IntStream.range(97, 122).forEach(num -> {
            assertFalse(Question01.startsWithUpperCaseAZ(((char) num) + "xyz"));
        });
    }

}
