package rocks.zipcode.assessment2.fundamentals;

import java.util.Arrays;
import java.util.List;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        String newString = string1 + string2;

        return newString;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        int len = string1.length();
        String[] myArray = string1.split("");
        String newString = "";
        for(int i = len - 1; i >= 0; i--){
            newString += myArray[i];
        }
        return newString;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String newString1 = reverse(string1);
        String newString2 = reverse(string2);
        return newString1 + newString2;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        String[] removeArray = charactersToRemove.split("");
        for(int i = 0; i < removeArray.length; i++){
            string = string.replace(removeArray[i], "");
        }
        return string;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String newString = removeCharacters(string, charactersToRemove);
        newString = reverse(newString);
        return newString;
    }
}
