package ru.vsu.cs.suvorov_d_a;

public class EnumerationOfCombinations {
    public static int calculateRecursion(int N) {
        if (N < 0) {
            return 0;
        }
        if (N <= 1) {
            return 1;
        }
        int sum = 0;
        for (int i = 1, s = 1; (3*i-1)*i/2 <= N; ++i) {
            int l = (3*i+1)*i/2;
            int m = (3*i-1)*i/2;
            sum += s*(calculateRecursion(N-l)+calculateRecursion(N-m));
            s = -s;
        }
        return sum;
    }
}
