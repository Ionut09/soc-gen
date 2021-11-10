package com.java._5_strings;

public class BalanceBrackets {

    public static void main(String... args) {
//        Closeable
        var str = new String[]{
                null,
                "",
                "   ",
                "[]{}",
                "({})",
                "{{[({})]}}",
                "{{]]",
                "{}{}{}{}["
        };

        for (String s : str) {
            System.out.println(s + " isBalanced = " + isBalanced(s));
        }
    }

    /**
     * "({})"
     * "()"
     * ""
     *
     * "{{]]"
     */
    private static boolean isBalanced(String s) {
        if (s == null || s.isEmpty()) return false;
        while (s.contains("()") ||
                s.contains("[]") ||
                s.contains("{}")) {

            s = s.replaceAll("\\{\\}", "")
                 .replaceAll("\\(\\)", "")
                 .replaceAll("\\[\\]", ""); //[a-z]
        }
//      return s.length()==0
        return s.isEmpty();
    }
}
