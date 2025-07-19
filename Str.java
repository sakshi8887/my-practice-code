import java.util.*;

public class Str {
    public static void printletter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        String firstname = "Sakshi";
        String lastname = "Gupta";
        String fullname = firstname + " " + lastname;
        printletter(fullname);
    }
}
