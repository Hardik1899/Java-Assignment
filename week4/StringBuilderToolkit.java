public class StringBuilderToolkit {

    static String reverse(String text) {
        if (text == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder(text);
        sb.reverse();

        return sb.toString();
    }

    static String repeat(String text, int count) {
        if (text == null) {
            return null;
        }

        if (count < 0) {
            return null;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(text);
        }

        return sb.toString();
    }

    static String joinWords(String[] words, String separator) {
        if (words == null) {
            return null;
        }

        if (separator == null) {
            separator = "";
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                sb.append(separator);
            }

            if (words[i] != null) {
                sb.append(words[i]);
            }
        }

        return sb.toString();
    }

    static String removeCharacterAt(String text, int index) {
        if (text == null) {
            return null;
        }

        if (index < 0 || index >= text.length()) {
            return text;
        }

        StringBuilder sb = new StringBuilder(text);
        sb.deleteCharAt(index);

        return sb.toString();
    }

    static String replaceCharacterAt(String text, int index, char replacement) {
        if (text == null) {
            return null;
        }

        if (index < 0 || index >= text.length()) {
            return text;
        }

        StringBuilder sb = new StringBuilder(text);
        sb.setCharAt(index, replacement);

        return sb.toString();
    }

    static String buildNumberedList(String[] items) {
        if (items == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < items.length; i++) {
            sb.append(i + 1);
            sb.insert(sb.length(), ". ");

            if (items[i] != null) {
                sb.append(items[i]);
            }

            if (i < items.length - 1) {
                sb.append("\n");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println("Reverse:");
        System.out.println(reverse("Hello"));

        System.out.println("\nRepeat:");
        System.out.println(repeat("Hi", 3));
        System.out.println(repeat("Hello", 0));
        System.out.println(repeat("Hello", -1));

        String[] words = {"Java", "Python", "C++"};

        System.out.println("\nJoin words:");
        System.out.println(joinWords(words, ", "));
        System.out.println(joinWords(new String[]{}, ", "));

        System.out.println("\nRemove character:");
        System.out.println(removeCharacterAt("Hello", 1));
        System.out.println(removeCharacterAt("Hello", -1));

        System.out.println("\nReplace character:");
        System.out.println(replaceCharacterAt("Hello", 1, 'a'));
        System.out.println(replaceCharacterAt("Hello", 10, 'a'));

        String[] items = {"Learn Java", "Practice DSA", "Build Projects"};

        System.out.println("\nNumbered list:");
        System.out.println(buildNumberedList(items));

        System.out.println("\nStringBuilder and String:");

        StringBuilder builder = new StringBuilder("Hello");

        // charAt() and length()
        System.out.println("First character: " + builder.charAt(0));
        System.out.println("Length: " + builder.length());

        String result = builder.toString();

        builder.append(" World");

        System.out.println("StringBuilder: " + builder);
        System.out.println("String: " + result);
    }
}

