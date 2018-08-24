package fizzbuzz;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void printingFizzForNumber3(){
        String result = FizzBuzz.printRange(1,3);
        assertEquals("1\n2\nFizz", result);
    }

    @Test
    public void printingFizzForNumber3AndBuzzForNumber5(){
        String result = FizzBuzz.printRange(1,5);
        assertEquals("1\n2\nFizz\n4\nBuzz", result);
    }
    @Ignore
    @Test
    public void printingFizzForNumber3AndBuzzForNumber5PlusFizzBuzzIfNumberDividesBy3And5(){
        String result = FizzBuzz.printRange(1,15);
        assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz", result);
    }
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumenExceptionWhenToIsLessThanFrom(){
        FizzBuzz.printRange(16,15);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumenExceptionWhenToIsMoreThan100(){
        FizzBuzz.printRange(16,101);
    }

    @Test
    public void printingFizzIfDividesBy3OrContains3(){
        String result = FizzBuzz.printRange(1,13);
        assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\nFizz", result);
    }
}