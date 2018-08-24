package fizzbuzz;

public class FizzBuzz {

    public static String printRange(int from, int to) {
        if (to < from || to > 100) {
            throw new IllegalArgumentException("Podano zły zakres. Od musi być mniejsze niż do. Do nie może być większe niż 100");
        }
        StringBuilder fizzBuzzSB = new StringBuilder();
        for (int i = from; i <= to; i++) {
            if (isFizzBuzz(i)) {
                fizzBuzzSB.append("FizzBuzz").append("\n");
            }
            else if(isFizz(i)) {
                fizzBuzzSB.append("Fizz").append("\n");
            }
            else if(isBuzz(i)) {
                fizzBuzzSB.append("Buzz").append("\n");
            } else {
                fizzBuzzSB.append(i).append("\n");
            }
        }
        deleteLastNewLine(fizzBuzzSB);
        return fizzBuzzSB.toString();
    }

    private static void deleteLastNewLine(StringBuilder fizzBuzzSB) {
        fizzBuzzSB.deleteCharAt(fizzBuzzSB.length() - 1);
    }

    private static boolean isBuzz(int i) {
        return i % 5 == 0 || Integer.toString(i).contains("5");
    }

    private static boolean isFizz(int i) {
        return i % 3 == 0 || Integer.toString(i).contains("3");
    }

    private static boolean isFizzBuzz(int i){
        return isFizz(i) && isBuzz(i);
    }
}
