package ArrayAssignment;

public class pracc {
    static String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void printdigit(int num) {
        if (num == 0) {
            return;
        }
        int lastdigit = num % 10;
        printdigit(num / 10);
        System.out.println(digits[lastdigit] + " ");
    }

    public static void main(String[] args) {
        printdigit(1234);
        System.out.println();
    }
}
