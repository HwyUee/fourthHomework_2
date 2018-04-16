package com.thoughtworks;

import org.junit.Test;
import static org.junit.Assert.*;
public class FizzBuzzGameTest {
    @Test
    public void should_return_Fizz_when_have_3() {

    }

    @Test
    public void testIsContain3() throws Exception {
        FizzBuzzGame fizzBuzzGame=new FizzBuzzGame();
        assertTrue(fizzBuzzGame.isContain3(13));
        assertFalse(fizzBuzzGame.isContain3(15));
    }

    @Test
    public void testIsThreeOfTimes() throws Exception {
        FizzBuzzGame fizzBuzzGame=new FizzBuzzGame();
        assertTrue(fizzBuzzGame.isThreeOfTimes(15));
        assertFalse(fizzBuzzGame.isThreeOfTimes(20));
    }

    @Test
    public void testIsFixOfTimes() throws Exception {
        FizzBuzzGame fizzBuzzGame=new FizzBuzzGame();
        assertTrue(fizzBuzzGame.isFixOfTimes(15));
        assertFalse(fizzBuzzGame.isFixOfTimes(21));
    }

    @Test
    public void testIsSevenOfTimes() throws Exception {
        FizzBuzzGame fizzBuzzGame=new FizzBuzzGame();
        assertTrue(fizzBuzzGame.isSevenOfTimes(49));
        assertFalse(fizzBuzzGame.isSevenOfTimes(64));
    }
}
