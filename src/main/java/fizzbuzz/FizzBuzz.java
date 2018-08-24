package fizzbuzz;

public class FizzBuzz {

    public static String printRange(int from, int to) {
        if (to < from || to > 100) {
            throw new IllegalArgumentException("Podano zły zakres. Od musi być mniejsze niż do. Do nie może być większe niż 100");
        }
        StringBuilder fizzBuzzSB = new StringBuilder();
        for (int i = from; i <= to; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzSB.append("FizzBuzz").append("\n");
            } else if (i % 3 == 0 || Integer.toString(i).contains("3")) {
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
