public class New {
    public static void main(String[] args)
    {
        String originalString = "  Hello, World!  ";

        String trimmedString = originalString.trim();
        System.out.println("Trimmed String: '" + trimmedString + "'");

        String upperCaseString = trimmedString.toUpperCase();
        System.out.println("Uppercase String: '" + upperCaseString + "'");

        String replacedString = upperCaseString.replace("WORLD", "UNIVERSE");
        System.out.println("Replaced String: '" + replacedString + "'");

        boolean startsWithHello = replacedString.startsWith("HELLO");
        System.out.println("Starts with 'HELLO': " + startsWithHello);

        String[] words = replacedString.split(", ");
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }

        String joinedString = String.join(", ", words);
        System.out.println("Joined String: '" + joinedString + "'");

        boolean containsUniverse = joinedString.contains("UNIVERSE");
        System.out.println("Contains 'UNIVERSE': " + containsUniverse);
    }
}




