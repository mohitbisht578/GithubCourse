package stringprograms;

public class PalindromeString {
	
    public static void main(String[] args) {

        String str = "madam";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if(rev.equalsIgnoreCase(str)) {
            System.out.println("given string is palindrome");
        }
        else {
            System.out.println("give string is not a palindrome");
        }

    }

}
