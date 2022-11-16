package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        return getChange(money);
    }

    public static List<Integer> getChange(int money) {
        if (!(money >= 1 && money <= 1000000)) {
            System.out.println("부자시네요.");
        }

        List<Integer> moneyArr = new ArrayList<>();
        int[] won = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
        for (int i = 0; i < won.length; i++) {
            if (money >= won[i]) {
                moneyArr.add(money / won[i]);
                money %= won[i];
            } else {
                moneyArr.add(0);
            }
        }
        return moneyArr;
    }
}
