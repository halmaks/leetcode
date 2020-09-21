package com.halmaks.leetcode;

/*
    Given a string s consists of upper/lower-case
    alphabets and empty space characters ' ', return
    the length of last word (last word means the
    last appearing word if we loop from left to right)
    in the string.
    If the last word does not exist, return 0.
    Note: A word is defined as a maximal substring
    consisting of non-space characters only.
    Example:
    Input: "Hello World"
    Output: 5
 */
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
