package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class JavaExercisesTest {

    @Test
    void testsleepIn() {
        JavaExercises exercises = new JavaExercises(); //creates an instance of the JavaExercises class,
                                                        // which is used to call the methods being tested.


        //test case 1: not a weekday, not on vacation (expected: true)
        assertTrue(exercises.sleepIn(false, false));

        //test case 2: not a weekday, on vacation (expected: false)
        assertTrue(exercises.sleepIn(false, true));

        //test case 3: a weekday, not on vacation (expected: false)
        assertFalse(exercises.sleepIn(true, false));

        //test case 4: a weekday, on vacation (expected: true)
        assertTrue(exercises.sleepIn(true, true));

    }

    @Test
    void testMonkeyTrouble() {

        JavaExercises exercises = new JavaExercises();
        // If both monkeys are smiling or neither is smiling, we're in trouble
        // return true if in trouble

        //test case 1: both monkeys smiling (expected: true)
        assertTrue(exercises.monkeyTrouble(true, true));

        //test case 2: both monkeys are not smiling (expected: true)
        assertTrue(exercises.monkeyTrouble(false, false));

        //test case 3: one monkey smiling, the other not (expected: false)
        assertFalse(exercises.monkeyTrouble(true, false));

        //test case 4: one monkey is not smiling, the other is smiling (expected: false)
        assertFalse(exercises.monkeyTrouble(false, true));


    }

    @Test
    void testSumDouble() {
        JavaExercises exercises = new JavaExercises();

        // Test case 1: sumDouble(1, 2) → 3
        assertEquals(3, exercises.sumDouble(1, 2));

        // Test case 2: sumDouble(3, 2) → 5
        assertEquals(5, exercises.sumDouble(3, 2));

        // Test case 3: sumDouble(2, 2) → 8
        assertEquals(8, exercises.sumDouble(2, 2));

        // Test case 4: sumDouble(-1, 0) → -1
        assertEquals(-1, exercises.sumDouble(-1, 0));

    }

    @Test
    void testStringTimes() {
        JavaExercises exercises = new JavaExercises();

        // Test case 1: String "Hi" repeated 3 times (expected: "HiHiHi")
        assertEquals("HiHiHi", exercises.stringTimes("Hi", 3));

        // Test case 2: Empty string repeated 5 times (expected: "")
        assertEquals("", exercises.stringTimes("", 5));

        // Test case 3: String "A" repeated 0 times (expected: "")
        assertEquals("", exercises.stringTimes("A", 0));

        // Test case 4: String "abc" repeated 1 time (expected: "abc")
        assertEquals("abc", exercises.stringTimes("abc", 1));
    }

    @Test
    void testFrontTimes() {
        JavaExercises exercises = new JavaExercises();

        // Test case 1: Front part of "Chocolate" repeated 2 times (expected: "ChoCho")
        assertEquals("ChoCho", exercises.frontTimes("Chocolate", 2));

        // Test case 2: Front part of "Abc" repeated 3 times (expected: "AbcAbcAbc")
        assertEquals("AbcAbcAbc", exercises.frontTimes("Abc", 3));

        // Test case 3: Front part of a short string "Ab" repeated 4 times (expected: "AbAbAbAb")
        assertEquals("AbAbAbAb", exercises.frontTimes("Ab", 4));

        // Test case 4: Front part of an empty string repeated 3 times (expected: "")
        assertEquals("", exercises.frontTimes("", 3));
    }



}
