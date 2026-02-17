public class Main {

    public Main() {
        System.out.println("= Palindrome String =");
    }

    public boolean isPalindromeString(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(str.length() - 1 - i) != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        String str1 = "Koushik";
        System.out.println(obj.isPalindromeString(str1));
        String str2 = "madam";
        System.out.println(obj.isPalindromeString(str2));
    }
}