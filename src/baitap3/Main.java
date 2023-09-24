package baitap3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();
        int[] arr = new int [1066666];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (int)(Math.random()*1000000);

        }
        stopwatch.getStartTime();
        Arrays.sort(arr);
        stopwatch.stop();

        System.out.println("Thời gian thực thi (miliseconds): " + stopwatch.getElapsedTime());
    }
}
