package com.company;
import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
    int i, x, least = 1;
    boolean found = false;
    
        for (i = 0; i < A.length; i++) {
            for (x = 0; x < A.length; x++){
                if (least == A[x]) {
                found = true;
                least++;
                }
            }
        }
        return least;
    }
}
