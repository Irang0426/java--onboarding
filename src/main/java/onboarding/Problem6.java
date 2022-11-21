package onboarding;

import java.util.*;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        return isDuplicates(forms);
    }

    public static List<String> isDuplicates(List<List<String>> forms) {
        Hashtable<String, String> table = new Hashtable<>();
        TreeSet<String> set = new TreeSet<>();

        for (List<String> form : forms) {
            for (int i = 1; i < form.get(1).length(); i++) {
                if (table.get(form.get(1).substring(i - 1, i + 1)) == null) {   // table에 두개의 문자로 자른 값이 있는지 확인
                    table.put(form.get(1).substring(i - 1, i + 1), form.get(0));    // 없으면 자른 값 넣기
                } else {    // else면 그 값이 있는 것이므로 중복  -> set에 넣기
                    set.add(form.get(0));   // 중복으로 걸러진 form의 이메일
                    set.add(table.get(form.get(1).substring(i - 1, i + 1)));    // table에 매칭되는 이메일 저장
                }
            }
        }

        return new ArrayList<>(set);
    }
}
