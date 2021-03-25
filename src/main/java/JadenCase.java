public class JadenCase {
    public String toJadenCase(String phrase) {
        // TODO put your code below this comment
        if (phrase != null && phrase.length() > 0) {
            String[] strings = phrase.split(" ");
            String[] newStrings = new String[strings.length];
            for (int i = 0; i < strings.length; i++) {
                newStrings[i] = String.valueOf(strings[i].charAt(0)).toUpperCase() + strings[i].substring(1);
            }

            String result = "";
            for (int i = 0; i < newStrings.length; i++) {
                result += newStrings[i] + " ";
            }

            return result.strip();
        } else {
            return null;
        }

    }
}
