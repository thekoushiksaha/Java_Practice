public class Main {

    public Main() {
        System.out.println("= String =");
    }

    public void printStringInTraverseWay(String str) {
        System.out.println("Printing String in Traverse Way: ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print("[" + str.indexOf(str.charAt(i)) + "] - " + str.charAt(i) + ", ");
        }
        System.out.println();
    }

    public void printStringInMultipleWays(String str) {
        System.out.println("Printing String in Normal Way: " + str);
        System.out.println("Substring from 0 to 3: " + str.substring(0, 3));
        printStringInTraverseWay(str);
    }

    public String addString(String str, String newStr) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(newStr);
        return sb.toString();
    }

    public static void main(String[] args) {
        Main obj = new Main();
        String str = "Koushik";
        obj.printStringInMultipleWays(str);
        str = obj.addString(str, " Saha");
    }
}