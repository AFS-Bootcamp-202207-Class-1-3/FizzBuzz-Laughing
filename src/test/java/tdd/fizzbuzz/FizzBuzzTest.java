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

    @Test
    public void should_return_Fizz_when_count_off_given_3(){
        String excepted="Fizz";
        int number=3;

        FizzBuzz fizzBuzz=new FizzBuzz();

        assertEquals(excepted,fizzBuzz.countOff(number));
    }

    @Test
    public void should_return_Buzz_when_count_off_given_5(){
        String excepted="Buzz";
        int number=5;

        FizzBuzz fizzBuzz=new FizzBuzz();

        assertEquals(excepted,fizzBuzz.countOff(number));
    }

    @Test
    public void should_return_FizzBuzz_when_count_off_given_15(){
        String excepted="FizzBuzz";
        int number=15;

        FizzBuzz fizzBuzz=new FizzBuzz();

        assertEquals(excepted,fizzBuzz.countOff(number));
    }

    @Test
    public void should_return_Whizz_when_count_off_given_7(){
        String excepted="Whizz";
        int number=7;

        FizzBuzz fizzBuzz=new FizzBuzz();

        assertEquals(excepted,fizzBuzz.countOff(number));
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_count_off_given_105(){
        String excepted="FizzBuzzWhizz";
        int number=105;

        FizzBuzz fizzBuzz=new FizzBuzz();

        assertEquals(excepted,fizzBuzz.countOff(number));
    }

}
