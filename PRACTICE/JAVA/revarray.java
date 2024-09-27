import java.util.Arrays;
import java.util.Collections;

class revarray{
    public static void main(String[] args) {
           Integer[] array = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(array));

        // Convert array to a list
        Collections.reverse(Arrays.asList(array));

        // Print the reversed array
        System.out.println("Reversed array: " + Arrays.toString(array));
    }
}
