import java.util.Scanner;

public class Main {

    public Main() {
        System.out.println("Check Vowel or Consonant");
    }

    public boolean isVowel(String alphabet) {
        return (alphabet.equals("a") || alphabet.equals("e") || alphabet.equals("i") || alphabet.equals("o")
                || alphabet.equals("u"));
    }

    public void getAlphabetFromUser() {
        System.out.print("Enter a alphabet in lowercase: ");
        Scanner sc = new Scanner(System.in);
        String alphabet = sc.next().toString();
        System.out.println(isVowel(alphabet) ? "Vowel" : "Consonant");
        sc.close();
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.getAlphabetFromUser();
    }
}