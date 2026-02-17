public class Main {

    public Main() {
        System.out.println("= Reverse String =");
    }

    public String getReverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(str.length() - 1 - i));
        }
        return sb.toString();
    }

    public void printString(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        String str = "Koushik Saha";
        obj.printString(str);
        str = obj.getReverseString(str);
        obj.printString(str);
    }
}