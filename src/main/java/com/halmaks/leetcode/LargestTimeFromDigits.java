package com.halmaks.leetcode; 

public class LargestTimeFromDigits {
 /* *   https://leetcode.com/explore/challenge/card/september-leetcoding-challenge/554/week-1-september-1st-september-7th/3445/

         Given an array of 4 digits, return
         the largest 24 hour time that can
         be made. The smallest 24 hour
         time is 00:00, and the largest is
         23:59. Starting from 00:00, a
         time is larger if more time has
         elapsed since midnight. Return
         the answer as a string of length
         5. If no valid time can be made,
         return an empty string.
         arr.length == 4 * 0 <= arr[i] <= 9
*/

  int withoutIndexOne = -1; 
  int withoutIndexTwo = -1; 
  boolean wholeCycle = false;

  public LargestTimeFromDigits() {
  
  }

  public String largestTimeFromDigits(int[] arr) { 
    final int HOURS_MAX_VALUE = 23; 
    final int MINUTES_MAX_VALUE = 59; 

    int[][] algorithm = new int[][]{
        {0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3}, 
        {1, 0, 0, 0, 2, 2, 1, 1, 3, 3, 3, 2} 
    };
    int tmp = 0; 
    int max = -1;
    int indexOne = -1;
    int indexTwo = -1;

    for (int i = 0; i < 12; i++) { 
      if((algorithm[0][i] == withoutIndexOne && algorithm[1][i] == withoutIndexTwo) || (algorithm[1][i] == withoutIndexOne && algorithm[0][i] == withoutIndexTwo)) {
        continue;
      }
      tmp = arr[algorithm[0][i]] * 10 + arr[algorithm[1][i]]; 
      if (tmp >= max && tmp <= HOURS_MAX_VALUE) { 
        max = tmp; 
        indexOne = algorithm[0][i]; 
        indexTwo = algorithm[1][i]; 
      } 
    } 
    String hours; 
    if (max < 0) {
       return ""; 
    } else if (max < 10) { 
      hours = "0" + max; 
    } else { 
      hours = "" + max; 
    }
    
    int[] minutesDigits = new int[2]; 
    int j = 0; 
    for (int i = 0; i < arr.length; i++) { 
      if (i != indexOne && i != indexTwo) { 
        minutesDigits[j] = arr[i]; 
        j++; 
      } 
    } 

    int minutesCaseOne = minutesDigits[0] * 10 + minutesDigits[1];
    if (minutesCaseOne > MINUTES_MAX_VALUE) {minutesCaseOne = -1;}
    int minutesCaseTwo = minutesDigits[1] * 10 + minutesDigits[0];
    if (minutesCaseTwo > MINUTES_MAX_VALUE) {minutesCaseTwo = -1;}
    if (minutesCaseOne >= minutesCaseTwo && minutesCaseOne >= 0) {
      if (minutesCaseOne < 10) {
        setStart();
        return hours + ":0" + minutesCaseOne;
      } else {
        setStart();
        return hours + ":" + minutesCaseOne;
      }
    } else if (minutesCaseTwo >= 0) {
      if(minutesCaseTwo < 10) {
        setStart();
        return hours + ":0" + minutesCaseTwo;
      } else {
        setStart();
        return hours + ":" + minutesCaseTwo;
      }
    } else {
      if(wholeCycle == false) {
        wholeCycle = true;
        withoutIndexOne = indexOne;
        withoutIndexTwo = indexTwo;
        return this.largestTimeFromDigits(arr);
      }
      setStart();
      return "";
    }

  }
  
  private void setStart() {
    this.withoutIndexOne = -1;
    this.withoutIndexTwo = -1;
    this.wholeCycle = false;
  }
}
