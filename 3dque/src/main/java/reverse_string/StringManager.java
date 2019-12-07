package reverse_string;

public class StringManager {

    private String givenString;

    public StringManager()
    {

    }

    public String reverseString(String givenString)
    {
        char[] charArray = givenString.toCharArray();

        // edge case, if string only has one char, just return given string
        if (charArray.length != 1) {

            // divide array length by 2 b/c we only want to switch
            // half of the string
            for (int i = 0; i < charArray.length / 2; i++) {
                char leftChar = charArray[i];
                char rightChar = charArray[(charArray.length - i) - 1];
                charArray[i] = rightChar;
                charArray[(charArray.length - i) - 1] = leftChar;

            }

            givenString = new String(charArray);

        }

        return givenString;

    }

}
