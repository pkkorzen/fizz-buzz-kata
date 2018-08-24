package fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void printingFizzForNumber3(){
        String result = FizzBuzz.printRange(1,3);
        assertEquals("1\n2\nFizz", result);
    }
}