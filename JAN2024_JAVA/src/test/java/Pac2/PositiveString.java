package Pac2;

public class PositiveString {
    public static void main(String[] args) {
       
        String inputString = "Alok";
        boolean isPositive = isPositiveString(inputString);
        System.out.println("Is the string positive? " + isPositive);
    }
    static boolean isPositiveString(String str) {
       
        str = str.toUpperCase();

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) < str.charAt(i - 1)) {
                return false;
            }
        }
        return true; 
    }
}