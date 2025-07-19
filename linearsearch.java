public class linearsearch {
    public static int lineser(String numbers[], String key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String numbers[] = { "Mango", "Apple", "Banana", "Orange", "Grapes" }; // This should be an array of integers
        String key = "Banana";
        int index = lineser(numbers, key);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }
}
