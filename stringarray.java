public class stringarray {
    public static void main(String[] args) {
       String input = "aaabbccccd";
        StringBuilder compressed = new StringBuilder();

        int count = 1; // to count repeated chars

        for (int i = 0; i < input.length(); i++) {
            // if next char is same, increase count
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                // append char + count
                compressed.append(input.charAt(i)).append(count);
                count = 1; // reset count
            }
        }

        System.out.println("Original: " + input);
        System.out.println("Compressed: " + compressed.toString());
        }
    }


