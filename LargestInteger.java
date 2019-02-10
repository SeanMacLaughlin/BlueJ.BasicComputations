 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
    int max = integers[0];
    for(int i = 1; i < integers.length; i++) {
        if(integers[i] > max) {
            max = integers[i];
        }
      }
      return max;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        int max = integers[0];
        for(int i = 0; i < integers.length; i++) {
            max = Math.max(max, integers[i]);
        }
        return max;
    }
}
