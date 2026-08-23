package Programmers.Lv3.단속카메라_42884;

import java.util.*;
class Solution {
    public int solution(int[][] routes) {
        Arrays.sort(routes,(a, b) -> Integer.compare(a[1], b[1]));

        int result = 0;
        int camera = -30001;

        for(int[] route : routes){
            int start = route[0];
            int end = route[1];

            if (camera < start) {
                camera = end;
                result++;
            }
        }
        return result;
    }
}
