public class Template {

    public String fizzBuzz(int i) {
        if (i >= 1 && i <= 100) {
            if (i % 3 == 0 && i % 5 == 0) {
                return "FizzBuzz";
            } else if (i % 3 == 0) {
                return "Fizz";
            } else if (i % 5 == 0) {
                return "Buzz";
            }
            return String.valueOf(i);
        }
        return "Number should be bigger than 1 and smaller than 100";
    }
}