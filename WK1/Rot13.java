package WK1;

public class Rot13 {

    String encrypt(String input, int rotation) {
        if (input == null) {
            return null;
        }

        StringBuilder characters = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ");
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            int index = characters.indexOf(Character.toString(input.charAt(i)));

            index += rotation;
            while(index >= characters.length()) {
                index -= characters.length();
            }
            while(index < 0) {
                index += characters.length();
            }

            answer.append(characters.charAt(index));
        }

        return answer.toString();
    }
}