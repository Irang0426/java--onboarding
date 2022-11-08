package onboarding;

import java.util.ArrayList;

public class Problem4 {
    public static String solution(String word) {
        return isConversion(word);
    }

    public static String isConversion(String str) {
        int alphaNum = 26;
        ArrayList<String> upper = new ArrayList<>();
        ArrayList<String> lower = new ArrayList<>();
        ArrayList<String> upper_reverse = new ArrayList<>();
        ArrayList<String> lower_reverse = new ArrayList<>();

        for (int i = 0; i < alphaNum; i++) {
            upper.add(String.valueOf((char)('A' + i)));
            upper_reverse.add(String.valueOf((char)('Z' - i)));
            lower.add(String.valueOf((char)('a' + i)));
            lower_reverse.add(String.valueOf((char)('z' - i)));
        }

        String[] conArr = str.split("");

        String conStr = "";

        for (int i = 0; i < conArr.length; i++) {
            for (int j = 0; j < alphaNum; j++) {
                if (conArr[i].equals(upper.get(j))) {
                    conStr += upper_reverse.get(j);
                } else if (conArr[i].equals(lower.get(j))) {
                    conStr += lower_reverse.get(j);
                } else if (conArr[i].equals(" ")){
                    conStr += " ";
                    break;
                }
            }
        }
        return conStr;
    }
}
