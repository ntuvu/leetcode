package Problem;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    // LVIII
    // MCMXCIV
    public static int romanToInt(String s) {
        String cs = "IVXLCDM";
        int[] vs = {1, 5, 10, 50, 100, 500, 1000};

        Map<Character, Integer> d = new HashMap<>();
        for (int i = 0; i < vs.length; ++i) {
            d.put(cs.charAt(i), vs[i]);
        }

        System.out.println("input: " + s);

        int n = s.length();
        int ans = d.get(s.charAt(n - 1));
        System.out.printf("Last: %d %n", ans);

        for (int i = 0; i < n - 1; ++i) {
            int sign = d.get(s.charAt(i)) < d.get(s.charAt(i + 1)) ? -1 : 1;
            ans += sign * d.get(s.charAt(i));
            System.out.printf("Loop %d: Roman Numeral %c = %d, Sign: %d, Running Total: %d%n",
                    i, s.charAt(i), d.get(s.charAt(i)), sign, ans);
        }

        return ans;
    }
}
