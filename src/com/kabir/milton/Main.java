//package search;
package com.kabir.milton;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        HashMap<String, List<String>> myMap = new HashMap<>();
        var lst = new ArrayList<String>();
        System.out.println("Enter the number of people:");
        int cnt = Integer.parseInt(sc.nextLine());
        System.out.println("Enter all people:");
        for (int i = 0; i < cnt; i++) {
            String st = sc.nextLine();
            lst.add(st);
            String[] ar = st.split(" ");
            for (String s : ar) {
                myMap.computeIfAbsent(s.toLowerCase(Locale.ROOT), k -> new ArrayList<>()).add(st);
            }
        }
        System.out.println();
        System.out.println("Enter the number of search queries:");
        cnt = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < cnt; i++) {
            System.out.println();
            System.out.println("Enter data to search people:");
            String st = sc.nextLine().toLowerCase(Locale.ROOT);
            int ccc = 0;
            Set<String> ss = new HashSet<>();
            for (String ii : myMap.keySet()) {
                if (ii.matches("(.*)" + st + "(.*)")) {
                    ccc = 1;
                    ArrayList<String> ans = (ArrayList<String>) myMap.get(ii);
                    ss.addAll(ans);
                }
            }
            if (ccc == 0) {
                System.out.println("No matching people found.");
            } else {
                System.out.println("\nFound people:");
                for (String s : lst) {

                    if (ss.contains(s)) {
                        System.out.println(s);
                    }
                }
            }

        }

    }
}
