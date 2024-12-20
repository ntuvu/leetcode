import Problem.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String input = "()[]{}";
        var res = ValidParentheses.isValid(input);

        System.out.println(res);
    }
}
