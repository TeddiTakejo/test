package com.company;

public class Solution2 {
    public static int solution(int[] A) {
        int N = A.length;
        int depth = -1;
        int P, Q, R;
        int i = 0, j, k;
        while (i < N - 2) {
            P = A[i];
            j = i + 1;
            int p = P;
            while (j < N - 1 && A[j] < p) {
                p = A[j++];
            }
            if (j == N - 1) {
                break;
            }
            if (j > i + 1) {
                Q = A[j - 1];
            } else {
                i++;
                continue;
            }
            k = j;
            int q = Q;
            while (k < N && A[k] > q) {
                q = A[k++];
            }
            if (k > j) {
                R = A[k - 1];
                depth = Math.max(depth, Math.min(P - Q, R - Q));
                i = k - 1;
            } else {
                i = j - 1;
            }
        }
        return Math.max(depth, -1);
    }
}
