class Solution {

    public int singleNumber(int[] arr) {
      int output = 0;
      for(int each:arr)output ^= each;
      return output; 
    }
}