public class BigString {
    public String toUpperCaseWords(String s){
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                result.append(capitalized).append(" ");
            }
        }
        return result.toString().trim();
    }
}
