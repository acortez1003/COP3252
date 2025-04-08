import java.security.SecureRandom;

public class RandomSentence {
    public static void main(String[] args) {
        String[] articleArray = {"the", "a", "one", "some", "any"};
        String[] nounArray = {"boy", "girl", "dog", "town", "car"};
        String[] verbArray = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] prepositionArray = {"to", "from", "over", "under", "on"};
        SecureRandom randomNum = new SecureRandom();

        for (int i = 0; i < 20; i++) {
            StringBuilder buffer = new StringBuilder();
            buffer.append(articleArray[randomNum.nextInt(5)]).append(" ")
              .append(nounArray[randomNum.nextInt(5)]).append(" ")
              .append(verbArray[randomNum.nextInt(5)]).append(" ")
              .append(prepositionArray[randomNum.nextInt(5)]).append(" ")
              .append(articleArray[randomNum.nextInt(5)]).append(" ")
              .append(nounArray[randomNum.nextInt(5)]).append(".");
            
              buffer.setCharAt(0, Character.toUpperCase(buffer.charAt(0)));
              System.out.println(buffer.toString());
        }
    }
}