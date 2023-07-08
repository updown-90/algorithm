package leetcode;

public class PalindRome {
    public static void main(String[] args) {
        int inputValue = -121;

        String convertInputValue1String = Integer.toString(inputValue);
        String convertInputValue1StringReverse = new StringBuilder(convertInputValue1String).reverse().toString();

        char[] convertInputValue1StringChar = convertInputValue1String.toCharArray();
        char[] convertInputValue1StringReverseChar = convertInputValue1StringReverse.toCharArray();

        boolean result = true;
        for (int i = 0; i < convertInputValue1StringChar.length; i++) {
            if (convertInputValue1StringChar[i] != convertInputValue1StringReverseChar[i]) {
                result = false;
                break;
            }
        }

        System.out.println(result);

    }
}
