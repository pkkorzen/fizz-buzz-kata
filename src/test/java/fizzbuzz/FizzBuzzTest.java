package fizzbuzz;

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

    @Test
    public void printingFizzForNumber3AndBuzzForNumber5PlusFizzBuzzIfNumberDividesBy3And5(){
        String result = FizzBuzz.printRange(1,15);
        assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz", result);
    }
}