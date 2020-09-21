package com.halmaks.leetcode;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        char[] c = s.toCharArray();

        if (c.length == 0) {
            return 0;
        }

        int count = 0;
        int spaces = 0;

        for (int i = 1; i <= c.length; i++) {
            if (c[c.length - i] == ' ') {
                if (i == 1 || (spaces > 0 && i == spaces + 1)) {
                    spaces++;
                    continue;
                }
                return count - spaces;
            }
            count = i;
        }
        if ( count == 0) {
            return count;
        } else {
            return count - spaces;
        }
    }

}
