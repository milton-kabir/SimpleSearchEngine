//package search;
package com.kabir.milton;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String[] ar = sc.nextLine().split(" ");
        HashMap<String, Integer> myMap = new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            myMap.put(ar[i], i + 1);
        }
        String fnd = sc.nextLine();
        if (myMap.containsKey(fnd)) {
            System.out.println(myMap.get(fnd));
        } else {
            System.out.println("Not found");
        }
    }
}
