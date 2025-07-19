package ArrayAssignment;

public class stringlen {
    public static int len(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return len(str.substring(1)) + 1;
    }

    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(len(str));
    }

}
