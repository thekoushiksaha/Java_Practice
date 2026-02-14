public class Main {

    public Main() {
        System.out.println("Check Palindrome Number");
    }

    public int reverseNumber(int number) {
        int revNumber = 0;
        while (number != 0) {
            revNumber = revNumber * 10 + number % 10;
            number /= 10;
        }
        return revNumber;
    }

    public boolean isPalindromeNumber(int number) {
        return number == reverseNumber(number);
    }

    public void validatePalindromeNumber(int number) {
        System.out.println(
                number + (isPalindromeNumber(number) ? " is a palindrome number." : " in not a palindrome number."));
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.validatePalindromeNumber(121);
        obj.validatePalindromeNumber(123);
    }
}