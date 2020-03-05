package chap05;

import java.util.Arrays;

public class Ch05Rik4 {
    public static void main(String... args) {
        System.out.println(Math.pow(6, 3));
        System.out.println(Math.abs(-15));
        int a[] = { 110, 14, 28, 32 };
        Arrays.sort(a);
        // for (int val : a) {
        //     System.out.println(val);
        // }
        System.out.println(Arrays.toString(a));
    }
}