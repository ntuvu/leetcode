package Problem;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        String sTrim = s.trim();
        String[] sArray = sTrim.split(" ");
        return sArray[sArray.length - 1].length();
    }
}
