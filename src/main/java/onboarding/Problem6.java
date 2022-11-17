package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = List.of("answer");
        return answer;
    }

    public static void main(String[] args) {
        List<List<String>> forms = List.of(
                List.of("jm@email.com", "제이엠"),
                List.of("jason@email.com", "제이슨"),
                List.of("woniee@email.com", "워니"),
                List.of("mj@email.com", "엠제이"),
                List.of("nowm@email.com", "이제엠")
        );

    }

    // 이름을 두 글자씩 나누는 함수
    public static List<String> twoCharacter(String str) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length() - 1; i++) {
            String temp = "";
            temp += str.charAt(i) + str.charAt(i + 1);
            list.add(temp);
        }

        return list;
    }
}
