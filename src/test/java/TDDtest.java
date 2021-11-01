import org.testng.Assert;
import org.testng.annotations.Test;

public class TDDtest {

    Template template = new Template();

    @Test
    public void testFizzBuzzNumberMultiplies3And5() {
        Assert.assertEquals("FizzBuzz", template.fizzBuzz(15));
    }

    @Test
    public void testFizzBuzzNumberMultiplies3() {
        Assert.assertEquals("Fizz", template.fizzBuzz(21));
    }

    @Test
    public void testFizzBuzzNumberMultiplies5() {
        Assert.assertEquals("Buzz", template.fizzBuzz(25));
    }

    @Test
    public void testFizzBuzzNumberThatNotMultiplies3And5() {
        Assert.assertEquals("4", template.fizzBuzz(4));
    }

    @Test
    public void testFizzBuzzNumberThatIsNotInTheRangeFrom1To100() {
        Assert.assertEquals("Number should be bigger than 1 and smaller than 100", template.fizzBuzz(-100));
    }
}