package fizzbuzz;

public class FizzBuzz {
    public static String printRange(int from, int to){
        StringBuilder fizzBuzzSB = new StringBuilder();
        for(int i = from; i <= to; i++){
            if(i%3 == 0){
                fizzBuzzSB.append("Fizz" +"\n");
            } else {
                fizzBuzzSB.append(i +"\n");
            }
        }
        fizzBuzzSB.deleteCharAt(fizzBuzzSB.length()-1);
        return fizzBuzzSB.toString();
    }
}
