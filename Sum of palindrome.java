class Solution {

    static long isSumPalindrome(long n) {

        for (int i = 0; i < 5; i++) {

            long reversed = reverseNumber(n);

            long sum = n + reversed;

            if (isPalindrome(sum)) {

                return sum;

            }

            n = sum;

        }

        return n;

    }

    

    // Function to reverse a number

    static long reverseNumber(long num) {

        long reversed = 0;

        while (num != 0) {

            long digit = num % 10;

            reversed = reversed * 10 + digit;

            num /= 10;

        }

        return reversed;

    }

    

    // Function to check if a number is palindrome

    static boolean isPalindrome(long num) {

        long original = num;

        long reversed = 0;

        while (num != 0) {

            long digit = num % 10;

            reversed = reversed * 10 + digit;

            num /= 10;

        }

        return original == reversed;

    }

}
