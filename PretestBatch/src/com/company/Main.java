package com.company;

import static com.company.Solution2.solution;
import static com.company.solution3.sumOfMinAbsDifferences;

public class Main {

    public static void main(String[] args) {
        //soal nomor 1
        LinkedList listt = new LinkedList();
        listt.push("A");
        listt.push("B");
        listt.push("C");
        listt.push("D");
        listt.push("E");
        System.out.println("====|Solution 1|====");
        System.out.println("The length of this list is "+listt.solution());
        System.out.println("====================");
        int pit[] ={0,1,3,-2,0,1,0,-3,2,3};
        System.out.println("====|Solution 2|====");
        System.out.println("The Function should return "+solution(pit));
        System.out.println("====================");
        //soal nomor 3
        int arr[] = {2, -4, 6, -3, 9};
        int n = arr.length;
        System.out.println("====|Solution 3|====");
        System.out.println( "Sum Equals "
                + sumOfMinAbsDifferences(arr, n));
        System.out.println("====================");
    }
}
