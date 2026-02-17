public class Main {

    public Main() {
        System.out.println("= Vowel and Consonant Count =");
    }

    public void printStringWithCountOfVowelAndConsonant(String str) {
        String vowel = "aeiou";
        str = str.toLowerCase();
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                if (vowel.indexOf(str.charAt(i)) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("String: " + str);
        System.out.println("Vowel Count: " + vowelCount);
        System.out.println("Consonant Count: " + consonantCount);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        String str = "Koushik Saha";
        obj.printStringWithCountOfVowelAndConsonant(str);
    }
}