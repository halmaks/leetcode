package com.halmaks.leetcode;

public class LengthOfLastWord {

  public int lengthOfLastWord(String s) {
    char [] c = s.toCharArray();
    
    if(c.length == 0) {
      return 0;
    }
    
    int count = 0;
    
    for(int i = c.length - 1; i > -1; i--) {
      if(c[i] == ' ') {
        return c.length - i - 1;
      }
      count = i;
    }
    
    return count;
  }

}
