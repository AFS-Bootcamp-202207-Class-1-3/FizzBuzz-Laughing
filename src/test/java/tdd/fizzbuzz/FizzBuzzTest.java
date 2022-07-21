package tdd.fizzbuzz;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_return_1_when_count_off_given_1(){
        String excepted="1";
        int number=1;

        FizzBuzz fizzBuzz=new FizzBuzz();

        assertEquals(excepted,fizzBuzz.countOff(number));
    }

}
