package org.example;

public class JavaExercises {

        //warmup1 sleepIn
        public boolean sleepIn(boolean weekday, boolean vacation) {
            // If it's not a weekday or they're on vacation, that means they're sleeping in.
            if (!weekday || vacation) {
                return true; // They're sleeping in.
            }
            // Otherwise, they're not sleeping in.
            return false;
        }

        //warmup1 monkeytrouble
        //This method returns true if we're in trouble because both monkeys are either smiling or not smiling.
        public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
            // If both monkeys are smiling or neither is smiling, we're in trouble
            if (aSmile == bSmile) {
                return true; // Trouble!
            }
            return false; // No trouble

        }

        //warmup1 sumDouble
        public int sumDouble(int a, int b) {
            // Calculate the sum of 'a' and 'b'
            int sum = a + b;

            // If 'a' and 'b' are equal, double the sum
            if (a == b) {
                sum = sum * 2;
            }

            // Return the final result
            return sum;
        }

        //warmup2 stringTimes
        public String stringTimes(String str, int n) {
            // Starting off with an empty string to build up our result
            String result = "";

            // Loop n times to add the string to the result
            for (int i = 0; i < n; i++) {
                result += str; // Adding the string to result in each loop
            }

            // Finally, return the big string we made
            return result;
        }

        //warmup2 frontTimes
        public String frontTimes(String str, int n) {
            int frontLen = 3; // We'll use 3 as the default length for the front part

            // If the string is shorter than 3 characters, adjust the length to the string's length
            if (frontLen > str.length()) {
                frontLen = str.length();
            }

            // Get the front part of the string
            String front = str.substring(0, frontLen);

            // Initialize the result string
            String result = "";

            // Loop n times to append the front part to the result
            for (int i = 0; i < n; i++) {
                result = result + front; // Add the front part to the result each time
            }

            // Return the final result string with n copies of the front part
            return result;
        }

    }