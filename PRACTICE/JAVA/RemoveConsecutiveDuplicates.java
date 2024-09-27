public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        String[] inputs = {
            "abcccba",
            "aaaabbbcccdefg",
            "abcd"
        };

        for (String input : inputs) {
            System.out.println("Input: " + input);
            String result = removeConsecutiveDuplicates(input);
            System.out.println("Final Output: " + result);
            System.out.println();
        }
    }

    public static String removeConsecutiveDuplicates(String input) {
        boolean hasDuplicates = true;

        while (hasDuplicates) {
            StringBuilder sb = new StringBuilder();
            hasDuplicates = false;

            int i = 0;
            while (i < input.length()) {
                char currentChar = input.charAt(i);
                int count = 1;

                // Count consecutive duplicates
                while (i + count < input.length() && input.charAt(i + count) == currentChar) {
                    count++;
                }

                // If no duplicates, add to result
                if (count == 1) {
                    sb.append(currentChar);
                } else {
                    hasDuplicates = true;
                }

                // Move to the next character
                i += count;
            }

            input = sb.toString();
            System.out.println("Iteration result: " + input);
        }

        return input;
    }
}
