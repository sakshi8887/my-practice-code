public class converuppertolower {
    public static void main(String[] args) {

        for (char ch = 'A'; ch <= 'Z'; ch++)/*
                                             * {
                                             * System.out.print((char) (ch | ' '));
                                             * }
                                             */ {
            System.out.print(Character.toLowerCase(ch));
        }

    }
}