package fizzbuzz;

public class FizzBuzz {

    public static String printRange(int from, int to) {
        if(to < from){
            throw new IllegalArgumentException("Podano zły zakres. Od musi być mniejsze niż do");
        }
        StringBuilder fizzBuzzSB = new StringBuilder();
        for (int i = from; i <= to; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzSB.append("FizzBuzz").append("\n");
            } else if (i % 3 == 0) {
                fizzBuzzSB.append("Fizz").append("\n");
            } else if (i % 5 == 0) {
                fizzBuzzSB.append("Buzz").append("\n");
            } else {
                fizzBuzzSB.append(i).append("\n");
            }
        }
        fizzBuzzSB.deleteCharAt(fizzBuzzSB.length() - 1);
        return fizzBuzzSB.toString();
    }
}
