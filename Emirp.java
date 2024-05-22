/* Siddharth Korukonda
   115607752
   CSE 114
   Paul Fodor
   Homework 3
   Question 2 (Emirp.java)
 */

public class Emirp {
    public static boolean isPrime(int n) {
        if (n<2) {
            return false;
        }
        for (int i=2; i<=Math.sqrt(n); i++) {
            if (n%i==0) {
                return false;
            }
        }

        return true;
    }

    public static boolean non_palindrome(int n) {
        String str = n+"";
        int str_length = str.length();

        if (isPrime(n)) {
            String str1 = "";

            for (int i=0; i<str_length/2; i++) {
                if (str.charAt(i)==str.charAt((str_length-1)-i)) {
                    return false;
                }
                else {
                    return true;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int emirpCount = 0;
        int n = 2;

        while (emirpCount < 100) {
            if (isPrime(n) && non_palindrome(n)) {

                String str = n+"";
                int length = str.length();
                String reversed_string = "";
                for (int i=length-1; i>=0; i--) {
                    reversed_string+=str.charAt(i);
                }
                int reversed = Integer.valueOf(reversed_string);

                if (n!=reversed && isPrime(reversed)) {
                    System.out.print(n+" ");
                    emirpCount++;
                }
            }
            n++;
        }
    }
}



