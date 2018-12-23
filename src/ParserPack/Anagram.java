package ParserPack;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String b = "APPLE";
        String e = "ELPPA";
        isAnagram(b, e);
        System.out.println(isAnagram(b, e));
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        char[] str1c = str1.toCharArray();
        Arrays.sort(str1c);
        char[] str2c = str2.toCharArray();
        Arrays.sort(str2c);
        return Arrays.equals(str1c, str2c);
    }
}









